/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pohjinghong_188_a3;

/**
 *
 * @author jingh
 */


import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class Demo extends JFrame
{
	private final JButton [] buttonArray;//BUTTON ARRAY
	private final Icon ic; //IMAGE 
	private final String [] imageArray = new String[49];
	
      
	public Demo()
	{
		super("LUCKY DRAW");//TITLE
		setLayout(new GridLayout(7,7));//7*7 BOXES
		
		ic = new ImageIcon("bug1.png");//getResource("bug1.png"));
                
		
		buttonArray = new JButton [49];
		 
		for(int i = 0; i < 49; i++)
		{
			buttonArray [i] = new JButton(ic);
                        buttonArray[i].setText(String.valueOf(i+1));//set number 1 to 49 for boxes
                      
			add(buttonArray[i]);
		}
                
              
                
	
		List <String> alist = Arrays.asList(imageArray);
                
		Collections.shuffle(alist);
  
		//Register for the event
		for(int k = 0; k < 49; k++)
		{                      
		buttonArray[k].addActionListener(new DriveDemo(new ImageIcon(alist.get(k))));
		}
                
             
                
	}
        
       
       
         int rand= (int) (Math.random()*49);//set random number  
         int count=0;
	private class DriveDemo implements ActionListener
	{
		private final Icon anImage;
		
		public DriveDemo(Icon anImage)
		{
			this.anImage = anImage;
		}
                
                            
    	@Override
		public void actionPerformed(ActionEvent e)
		{
                       Icon congrats= new ImageIcon("congrats.gif");
                       Icon oneMore= new ImageIcon("oneMore.gif");
                        JButton pressedButton = (JButton)e.getSource();
                        pressedButton.setBackground(Color.YELLOW);
                        pressedButton.setFont(new Font("Arial", Font.BOLD, 18));
                         
                        if(e.getSource() == (buttonArray[rand])){
                            pressedButton.setBackground(Color.GREEN);
                            JOptionPane.showMessageDialog(null,"You Win The First Prize!!!","WIN!!!!",JOptionPane.INFORMATION_MESSAGE,congrats);
                        }
                            
                        
                        
                        
                        else if(e.getSource() != (buttonArray[rand])) {
                            ++count;
                            pressedButton.setBackground(Color.YELLOW);
                            JOptionPane.showMessageDialog(null, "Oops , nothing inside....", "Nothing ",JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, "You still have "+(8-count)+" chances ", "Nothing ",JOptionPane.INFORMATION_MESSAGE,oneMore);
                            
                            
                            if(count>7){
                                  JOptionPane.showMessageDialog(null,"THE FIRST PRIZE IS AT "+(rand+1),"win",JOptionPane.INFORMATION_MESSAGE);
                            }
                            
                        
                                }
                      
                }
                }
        }
      



public class PohJingHong_188_A3 
{
	public static void main (String [] args)
	{
		Demo d = new Demo();
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d.setSize(150, 100);
		d.setVisible(true);
                
               System.out.println();
                
	}
}