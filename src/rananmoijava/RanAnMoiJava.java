/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rananmoijava;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class RanAnMoiJava extends JFrame {

    GameScreen game;

    public RanAnMoiJava() {
        setSize(1000, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        game = new GameScreen();
        add(game);

        this.addKeyListener(new handler());

        setVisible(true);// hiển thị frame
    }

    public static void main(String[] args) {
        RanAnMoiJava f = new RanAnMoiJava();
    }

    private class handler implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                GameScreen.isPlaying = !GameScreen.isPlaying;// hàm ấn Space để dừng
                if (GameScreen.isGameOver) {
                    GameScreen.isGameOver = false;
                    game.ran.resertGame();
                }
            }

            if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
                game.ran.setVector(ConRan.GO_UP);
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
                game.ran.setVector(ConRan.GO_DOWN);
            }
            if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
                game.ran.setVector(ConRan.GO_LEFT);
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
                game.ran.setVector(ConRan.GO_RIGHT);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

    }
}