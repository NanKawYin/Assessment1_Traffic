package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameGUI extends SimulatorValue implements ActionListener
{

    public class Game_GUI extends SimulatorValue implements ActionListener, KeyListener {
        private JButton btn_reset = new JButton("Reset");
        private JButton btn_load = new JButton("Load");
        private JButton btn_save = new JButton("Save");
        private JButton btn_exit = new JButton("Exit");
        private JButton btn_simulate = new JButton("Simulate");
        private JButton btn_stop = new JButton("Stop Simulate");
        private JButton btn_pause = new JButton("Pause Simulate");
        private JButton btn_go = new JButton("Resume Simulate");
        private JButton btn_sum = new JButton("-");
        private JButton btn_sub = new JButton("+");

        private JLabel lbl_car = new JLabel("Car Speed : ");
        private JLabel lbl_mode = new JLabel("Mode: Editing");

        private JButton btn_road1 = new JButton("Straight Road");
        private JButton btn_road2 = new JButton("4-way Road");
        private JButton btn_road3 = new JButton("3-way Road");

        @Override
        public void actionPerformed(ActionEvent e) {

        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }