/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg2.agenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame {

    Scanner teclado = new Scanner(System.in);
    Scanner texto = new Scanner(System.in);

    JPanel inicio = new JPanel();
    JTextField txtv = new JTextField();
    JTextField txtn = new JTextField();
    JTextField txtc = new JTextField();
    guardar array[] = new guardar[8];
    JTextField txtguardado = new JTextField();
    int numero = 0;
    String nombre, correo;

    public ventana() {
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void inserpanel() {

        this.getContentPane().add(inicio);
        inicio.setLayout(null);

    }

    public void textos() {
        txtv.setBounds(20, 30, 200, 50);
        inicio.add(txtv);
        txtv.repaint();

        txtn.setBounds(20, 150, 200, 50);
        inicio.add(txtn);
        txtn.repaint();

        txtc.setBounds(20, 300, 200, 50);
        inicio.add(txtc);
        txtc.repaint();
    }

    public void insertarEtiquetas() {

        JLabel lblvalor = new JLabel("telefono");
        lblvalor.setBounds(20, 10, 200, 15);
        inicio.add(lblvalor);

        JLabel lbln = new JLabel("nombre");
        lbln.setBounds(20, 120, 200, 15);
        inicio.add(lbln);

        JLabel lblc = new JLabel("correo");
        lblc.setBounds(20, 280, 200, 15);
        inicio.add(lblc);

    }

    public void insertarBotones() {
        JButton btng = new JButton("guardar");
        btng.setBounds(300, 130, 100, 70);
        inicio.add(btng);
        btng.repaint();
        ActionListener guardar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtv.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ingrese el valor");

                } else {
                    numero = Integer.parseInt(txtv.getText());
                    nombre=txtn.getText();
                    correo=txtc.getText();
                    

                }
                txtv.setText("");
                txtn.setText("");
                txtc.setText("");

            }
        };
        btng.addActionListener(guardar);

        JButton btna = new JButton("actualizar");
        btna.setBounds(300, 250, 100, 70);
        inicio.add(btna);
        btna.repaint();

        JButton btnb = new JButton("buscar");
        btnb.setBounds(500, 130, 100, 70);
        inicio.add(btnb);
        btnb.repaint();
        
        ActionListener buscar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtv.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ingrese el valor");

                } else {
                    
                    

                }
                

            }
        };
        btnb.addActionListener(buscar);

        JButton btnel = new JButton("eliminar");
        btnel.setBounds(500, 250, 100, 70);
        inicio.add(btnel);
        btnel.repaint();

    }

}
