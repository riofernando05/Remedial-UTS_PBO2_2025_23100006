/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.padelrentalform;
import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author riofe
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.OutputStream;
 

public class PadelRentalForm extends JFrame {
   private JTextField tfNama;
   private JComboBox<String> cbLapangan;
   private JTextField tfNoHp;
   private JTextField tfTanggal;
   private JTextField tfJamMulai;
   private JTextField tfJamSelesai;
   private JButton submitButton;
   private JButton editButton;
   private JButton deleteButton;
   
   public PadelRentalForm() {
       setTitle("Form Sewa Lapangan Padel");
       setSize(600, 450);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLayout(new GridLayout(7, 2, 10, 10));
       setLocationRelativeTo(null);
       JPanel formPanel = new JPanel();
       
       formPanel.add(new JLabel("Nama:"));
       tfNama = new JTextField();
       formPanel.add(tfNama);
       
       formPanel.add(new JLabel("NoHp:"));
       tfNoHp= new JTextField();
       formPanel.add(tfNoHp);
       
       formPanel.add(new JLabel("Tanggal: "));
       tfTanggal = new JTextField("yyyy-mm-dd");
       formPanel.add(tfTanggal);
       
       formPanel.add(new JLabel("Jam Mulai: "));
       tfJamMulai = new JTextField("08:00");
       formPanel.add(tfJamMulai);
       
       formPanel.add(new JLabel("Jam Selesai: "));
       tfJamSelesai = new JTextField("09:00");
       formPanel.add(tfJamSelesai);
       
       formPanel.add(new JLabel("Lapangan Tersedia:"));
       cbLapangan = new JComboBox<>(new String[] {"Lapangan 1", "Lapangan 2", "Lapangan 3", "Lapangan 4"});
       formPanel.add(cbLapangan);
       
        submitButton = new JButton("Simpan");
        formPanel.add(submitButton);

        editButton = new JButton("Edit");
        formPanel.add(editButton);
        
        deleteButton = new JButton("Hapus");
        formPanel.add(deleteButton);
        
       JButton btnEdit = new JButton("Edit");
       JButton btnAdd = new JButton("Tambah");
       JButton btnSubmit = new JButton("Simpan");
       
       add(new JLabel("Nama Penyewa:")); add(tfNama);
       add(new JLabel("No HP:")); add(tfNoHp);
       add(new JLabel("Tanggal Sewa:")); add(tfTanggal);
       add(new JLabel("Jam Mulai:")); add(tfJamMulai);
       add(new JLabel("Jam Selesai:")); add(tfJamSelesai);
       add(new JLabel("Lapangan:")); add(cbLapangan);
       add(btnSubmit); add(new JLabel());
   }

   public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PadelRentalForm().setVisible(true));
   }
}