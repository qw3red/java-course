package my;

import my.exceptions.NegativeValueException;

import javax.swing.*;

public class ExceptionTest {
    public static void main(String[] args) {
        double a;
        for (; ;) {
            try {
                a = Double.parseDouble(JOptionPane.showInputDialog("Input double number"));
                if(a<0) {
                    NegativeValueException err = new NegativeValueException(a);
                    throw err;
                }
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error number format");
            }
            catch (NullPointerException e) {
                a = 0;
                JOptionPane.showMessageDialog(null, "User is canceled input");
                break;
            }
            catch (NegativeValueException e) {
                JOptionPane.showMessageDialog(null, "Negative value " + e.getNumber());
            }
        }
        System.out.println(a);
    }
}
