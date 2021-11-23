package myProject;

import javax.swing.*;
import java.awt.*;

/**
 * This class is used for show use MouseListener, MouseMotionListener and KeyListener
 * @autor Paola-J Rodriguez-C paola.rodriguez@correounivalle.edu.co
 * @version v.1.0.0 date:22/11/2021
 */
public class GUI extends JFrame {

    private Header headerProject;
    private JPanel panelMouse;
    private JTextArea mensajes;

    /**
     * Constructor of GUI class
     */
    public GUI(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("MouseListener, MouseMotionListener and KeyListener");
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is used to set up the default JComponent Configuration,
     * create Listener and control Objects used for the GUI class
     */
    private void initGUI() {
        //Set up JFrame Container's Layout
        //Create Listener Object and Control Object
        //Set up JComponents
        headerProject = new Header("Manejando Escuchas del Mouse y del Teclado", Color.BLACK);
        this.add(headerProject,BorderLayout.NORTH); //Change this line if you change JFrame Container's Layout

        panelMouse = new JPanel();
        panelMouse.setBackground(Color.BLUE);
        panelMouse.setPreferredSize(new Dimension(600,120));


        mensajes = new JTextArea(7,3);
        mensajes.setEditable(false);
        JScrollPane scroll = new JScrollPane(mensajes);

        add(panelMouse,BorderLayout.CENTER);
        add(scroll,BorderLayout.SOUTH);
    }

    /**
     * Main process of the Java program
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            GUI miProjectGUI = new GUI();
        });
    }

    /**
     * inner class that extends an Adapter Class or implements Listeners used by GUI class
     */
    private class Escucha {

    }
}
