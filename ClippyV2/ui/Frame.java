/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClippyV2.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author GavinC
 */
public abstract class Frame extends JFrame {
    private static final Color backgroundColor = Color.white;
    private ImageIcon exitIcon;
    private RoundButton exitFrame;

    public Frame(int sizeX, int sizeY, int locatX, int locatY){
        super();
        this.setPreferredSize(new Dimension(sizeX,sizeY));
        this.setLocation((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth()-locatX, 
        (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight()-locatY);
        this.setUndecorated(true);
        this.setBackground(backgroundColor);
        this.setOpacity(0.6f);
        this.setLayout(null);
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        try{
            exitIcon = new ImageIcon(getClass().
            getResource("View/Images/exit.png")); 
        }
        catch(NullPointerException ex){
            
        }
        exitFrame = new RoundButton(exitIcon);
    }
    
    public Color getBgColor(){
        return backgroundColor;
    }
    
    public void setNewSize(int x, int y){
        this.setPreferredSize(new Dimension(x,y));
    }
    
    public void createExitBtn(){
        exitFrame.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){ 
               dispose();
            }     
        });
                    
    }
    
}
