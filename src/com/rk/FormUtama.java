package com.rk;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {

    JTextField jtf2;

    public FormUtama() {
        super("AutoCompleteText");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        jtf2 = new JTextField();
        jtf2.setFont(new Font("Tahoma", Font.BOLD, 18));
        jtf2.setPreferredSize(new Dimension(300, 46));
        jtf2.addKeyListener(new AutoComplete_KeyAdapter(jtf2));
        getContentPane().add(jtf2, BorderLayout.CENTER);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
