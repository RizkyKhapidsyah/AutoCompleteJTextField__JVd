package com.rk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class AutoComplete_KeyAdapter extends KeyAdapter {

    JTextField jtf;
    ArrayList L;

    public AutoComplete_KeyAdapter(JTextField jTextField) {
        this.jtf = jTextField;
        L = new ArrayList();
        L.add("Rizky Khapidsyah");
        L.add("Dessy Puspita Sari");
        L.add("Mariana Devanty");
        L.add("Syafira Mukhlish");
        L.add("Hana Rezki Adelia");
        L.add("Nova Pratiwi");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_BACK_SPACE:
                break;
            case KeyEvent.VK_ENTER:
                jtf.setText(jtf.getText());
                break;
            default:
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        String teks = jtf.getText();
                        LakukanPenyelesaian(teks);
                    }
                });
                break;
        }
    }

    private void LakukanPenyelesaian(String teks) {
        String teksPenyelesaian = "";
        int Mulai = teks.length();
        int Akhir = teks.length();

        for (int i = 0; i < L.size(); i++) {
            if (L.get(i).toString().startsWith(teks)) {
                teksPenyelesaian = L.get(i).toString();
                Akhir = teksPenyelesaian.length();
                break;
            }
        }

        if (Akhir > Mulai) {
            jtf.setText(teksPenyelesaian);
            jtf.setCaretPosition(Akhir);
            jtf.moveCaretPosition(Mulai);
        }
    }
}
