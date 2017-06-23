/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verbeirregulier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author bonam
 */
public class jFrRable extends JFrame {

    public jFrRable() {

    }

    public void requete(String[] titl, String[][] data) {

        //g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Voici les erreurs");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setVisible(true);

        JTable tableau = new JTable(data, titl);
    //Nous ajoutons notre tableau à notre contentPane dans un scroll
        //Sinon les titres des colonnes ne s'afficheront pas !
        this.getContentPane().add(new JScrollPane(tableau));
       //this.getContentPane().add(new JScrollPane(tableau));  
        // Nous ajoutons notre tableau à notre contentPane dans un scroll
        //Sinon les titres des colonnes ne s'afficheront pas !
        //tableau.add(new JScrollPane(tableau));
        //    getContentPane().add(new JScrollPane(tableau));

        //tableau.setFillsViewportHeight(true);
        //this.getContentPane().add(new JScrollPane(tableau));
    }
}
