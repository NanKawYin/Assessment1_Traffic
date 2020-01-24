package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class Game_GUI extends SimulatorValue implements ActionListener, KeyListener
{
    private JButton btn_reset = new JButton("Reset");
    private JButton btn_load = new JButton("Load");
    private JButton btn_save = new JButton("Save");
    private JButton btn_exit = new JButton("Exit");
    private JButton btn_simulate = new JButton ("Simulate");
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


    public Game_GUI()
    {
        this.setLocation(250, 0);

        setLayout(new BorderLayout());//Whole layout

        //panel1.setBackground()
        JPanel p_btn = new JPanel(new FlowLayout(FlowLayout.CENTER));

        btn_reset.addActionListener(this);
        btn_load.addActionListener(this);
        btn_save.addActionListener(this);
        btn_exit.addActionListener(this);
        btn_simulate.addActionListener(this);
        btn_stop.addActionListener(this);
        btn_pause.addActionListener(this);
        btn_go.addActionListener(this);
        btn_sum.addActionListener(this);
        btn_sub.addActionListener(this);

        btn_reset.setBackground(paint);
        btn_load.setBackground(paint);
        btn_save.setBackground(paint);
        btn_exit.setBackground(paint);
        btn_simulate.setBackground(paint);
        btn_stop.setBackground(paint);
        btn_pause.setBackground(paint);
        btn_go.setBackground(paint);
        btn_sum.setBackground(paint);
        btn_sub.setBackground(paint);

        btn_pause.setVisible(false);
        btn_go.setVisible(false);
        btn_stop.setVisible(false);
        btn_sum.setVisible(false);
        btn_sub.setVisible(false);
        lbl_car.setVisible(false);

        p_btn.add(btn_reset);
        p_btn.add(btn_load);
        p_btn.add(btn_save);
        p_btn.add(btn_exit);
        p_btn.add(btn_pause);
        p_btn.add(btn_go);
        p_btn.add(btn_simulate);
        p_btn.add(btn_stop);


        add(p_btn, BorderLayout.NORTH);
        showMap();
        panel1.setBackground(background_paint);
        panel1.addKeyListener(this);
        panel1.setFocusable(false);
        add(panel1, BorderLayout.CENTER);

        //button panel/
        JPanel p_road_btn = new JPanel(new FlowLayout(FlowLayout.CENTER));

        btn_road1.addActionListener(this);
        btn_road2.addActionListener(this);
        btn_road3.addActionListener(this);

        btn_road1.setBackground(paint);
        btn_road2.setBackground(paint);
        btn_road3.setBackground(paint);

        p_road_btn.add(lbl_mode);
        p_road_btn.add(lbl_car);
        p_road_btn.add(btn_sub);
        p_road_btn.add(btn_sum);
        p_road_btn.add(btn_road1);
        p_road_btn.add(btn_road2);
        p_road_btn.add(btn_road3);

        add(p_road_btn, BorderLayout.SOUTH);

        addWindowListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
        pack();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char key = e.getKeyChar();
        System.out.println("code" + e.getExtendedKeyCode());
        if(key == 'w'){
            moveEditRoad(current_edit_road_type,'N',current_edit_road_rotation);
        }
        else if(key == 'd'){
            moveEditRoad(current_edit_road_type,'E',current_edit_road_rotation);
        }
        else if(key == 's'){
            moveEditRoad(current_edit_road_type,'S',current_edit_road_rotation);
        }
        else if(key == 'a'){
            moveEditRoad(current_edit_road_type,'W',current_edit_road_rotation);
        }
        else if(e.getExtendedKeyCode() == 32){
            undoEditing();
            rotateEditingObj(current_edit_road_type);
        }
        else if(key == 'r'){
            btn_reset.setEnabled(true);
            btn_load.setEnabled(true);
            btn_save.setEnabled(true);
            btn_simulate.setEnabled(true);
            btn_road1.setEnabled(true);
            btn_road2.setEnabled(true);
            btn_road3.setEnabled(true);
            panel1.setFocusable(false);

            undoEditing();
        }
        else if(e.getExtendedKeyCode() == 10){
            btn_reset.setEnabled(true);
            btn_load.setEnabled(true);
            btn_save.setEnabled(true);
            btn_simulate.setEnabled(true);
            btn_road1.setEnabled(true);
            btn_road2.setEnabled(true);
            btn_road3.setEnabled(true);
            panel1.setFocusable(false);

            endEditing(current_edit_road_type);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
