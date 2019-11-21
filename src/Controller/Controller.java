/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.awt.event.*;
import GUI.*;
import Model.*;
import javax.swing.JPanel;
/**
 *
 * @author MSI
 */
public class Controller extends MouseAdapter implements ActionListener  {
    private LoginMenu MenuLogin;
    private AdminMenu MenuAdmin;
    
    
    public Controller(){
        MenuLogin = new LoginMenu();
        MenuAdmin = new AdminMenu();
        MenuLogin.addActionListener(this);
        MenuAdmin.addActionListener(this);
        
        MenuAdmin.setVisible(false);
        MenuLogin.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        if (source.equals(MenuLogin.getLogin())) {
            String Username = MenuLogin.getUsername();
            String Password = MenuLogin.getPassword();
            MenuLogin.ResetView();
            if(Username.equals("Admin") && Password.equals("Admin123")){
                MenuLogin.setVisible(false);
                MenuAdmin.setVisible(true);
            }
        } else if(source.equals(MenuAdmin.getbtnLogOut())){
            MenuAdmin.setVisible(false);
            MenuLogin.setVisible(true);
        }
    }
}
