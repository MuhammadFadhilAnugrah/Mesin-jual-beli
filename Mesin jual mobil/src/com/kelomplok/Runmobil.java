package com.kelomplok;

import javax.swing.*;

public class Runmobil {
    public static void main(String[]args){
        JFrame jFrame= new JFrame("Form Jualbeli");
        jFrame.setContentPane(new FormJualBeli().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(600,500);
        jFrame.setVisible(true);
    }


}
