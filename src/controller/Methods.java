package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Admin;

public class Methods implements Repository{
    
    Connection connection = Database.connect();

    public Methods() {
        
    }
    
    @Override
    public void edit(String sql) {
        try {
            PreparedStatement edit = connection.prepareStatement(sql);
            edit.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        } 
    }

    @Override
    public void delete(String sql) {
        try {
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
