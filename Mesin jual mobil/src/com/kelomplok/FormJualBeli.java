package com.kelomplok;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class FormJualBeli {
    private JTextField textBrand;
    private JTextField textNamaMobil;
    private JComboBox JenisMesin;
    private JComboBox TipeBody;
    private JButton cekButton;
    private JTable table1;
    private JPanel rootPanel;

    private oopkelompok oopkelompok;

    private DefaultTableModel tableModel;

    public void insertingDataToFile(String inputtedData) throws IOException {
        try {
            FileWriter myFile = new FileWriter("FILE DATA BANK", true);
            myFile.write(inputtedData);
            myFile.close();
            System.out.println("BERHASIL MENIMPAN FILE");
        } catch (IOException ex) {
            System.out.println("ERRORRRRR");
            ex.printStackTrace();
        }
    }





    public FormJualBeli() {

        this.oopkelompok = new oopkelompok();
        this.initComponents();

        cekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ngambil data
                String brand = textBrand.getText();
                String namamobil = textNamaMobil.getText();
                String mesin = JenisMesin.getSelectedItem().toString();
                String body = TipeBody.getSelectedItem().toString();

                oopkelompok.setTexbrand(brand);
                oopkelompok.setTextnamaMobil(namamobil);
                oopkelompok.setJenisMesin(mesin);
                oopkelompok.setTipeBody(body);

                tableModel.addRow(new Object[]{brand, namamobil, mesin, body});

                String hasil = "\nBrand Mobil" + brand + "\nNama Moabil" + namamobil + "\nJenis Mesin" + mesin + "\nTipe Body" + body + "\n\n";
                FileWriter sc = null;
                try {
                    sc = new FileWriter("data pembeli.txt", true);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    sc.write(hasil);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    sc.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

    }

    private void initComponents(){
        Object[] tableColum = {"BrandMobil", "Nama Mobil", "Jenis Mesin", "Tipe Body"};

        Object[][] row = {};

        tableModel = new DefaultTableModel(row, tableColum);
        table1.setModel(tableModel);
        table1.setAutoCreateRowSorter(true);
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}