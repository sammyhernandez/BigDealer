package Utiliti;

import java.awt.event.KeyEvent;

/**
 *
 * @author gerson
 */
public class Valida {

    public static boolean validaStr(int key){
        
        if (key > 64 && key < 91){
            return true;
        }else if (key > 96 && key < 123){
            return true;
        }else if (key == 130 || key == 32){
            return true;
            
        }else return key > 159 && key < 166;
        
    }
    
    public static boolean validaNum(int key){
        
        return key > 47 && key < 58;
        
    }
    
    public static boolean validaUpDown(int key){
        
        switch(key){
            case KeyEvent.VK_UP:
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_KP_UP:
            case KeyEvent.VK_KP_DOWN:
                return true;
            default:
                return false;
        }
    }
}
