/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author gsium
 */
public class Formulario extends JFrame {//___________________________________
    public JPanel panel;                 //Se Crea la clase ventana y Atributos
    private JTextField caja1,caja2,caja3;//__________________________________
    public JComboBox Lista;
    private JTextArea Area;
    public JButton Agregar,eliminar;

    public Formulario(JTextArea Area) {//______________________________________
        this.Area = Area;
    }

    public void setArea(JTextArea Area) {
        this.Area = Area;
    }
// SE CREAN LOS CONSTRUCTORES Y SUS METODOS SETTER Y GETTERS
    public JTextArea getArea() {
        return Area;
    }
    
    

    public Formulario(JTextField caja1, JTextField caja2, JTextField caja3) {
        this.caja1 = caja1;
        this.caja2 = caja2;
        this.caja3 = caja3;
        
        
    }

    public JTextField getCaja1() {
        return caja1;
    }

    public JTextField getCaja2() {
        return caja2;
    }

    public JTextField getCaja3() {
        return caja3;
    }

    public void setCaja1(JTextField caja1) {
        this.caja1 = caja1;
    }

    public void setCaja2(JTextField caja2) {
        this.caja2 = caja2;
    }

    public void setCaja3(JTextField caja3) {
        this.caja3 = caja3;
    }
    //____________________________________________________________________________________________________
    
    //SE CREA LA VENTANA
     public Formulario(){
      this.setSize(700, 700);
      this.setTitle("Registro");
       this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      colocarPanel();
      InicarComponente();
     }
     //ENCIMA DE LA VENTANA SE COLOCA EL PANEL  Y SE DESABILITA EL EL ESTILO PREDETERMINADO 
     private void colocarPanel(){
  panel=new JPanel();
     this.getContentPane().add(panel);
     panel.setLayout(null);
     }
     public void InicarComponente(){
         //_________________________________________________________________________
         
         JLabel et1 =new JLabel("Numero de Cuenta: ");
         JLabel et2 =new JLabel("Nombre:");//SE CREAN LA ETIQUETAS 
         JLabel et3 =new JLabel("Apellido:");
         JLabel et4=new JLabel("Carreras");
        
         et1.setBounds(20, 80, 120, 50);
         et2.setBounds(120, 130, 50, 30);//SE POSICIONAN LAS ETIQUETAS 
         et3.setBounds(320, 130, 50, 30);
         et4.setBounds(100, 170, 180, 30);
         panel.add(et1);
         panel.add(et2);
         panel.add(et3);//SE AGREGAN AL PANEL
         panel.add(et4);
         //__________________________________________________________________________ 
         caja1=new JTextField();
         caja2=new JTextField();//SE CREA LAS CAJAS DE TEXTO
         caja3=new JTextField();
         caja1.setBounds(160,90, 250, 30);
         caja2.setBounds(180, 130, 100, 30);
         caja3.setBounds(400, 130, 100, 30);//SE POSICIONAN LAS CAJAS
         panel.add(caja1);
         panel.add(caja2);//SE AGREGAN AL PANEL
         panel.add(caja3);
         //____________________________________________________________________________
         
         
         String[] carreras={"Ingenieria en Computacion","Licenciatura en Turismo","Ingenieria en Electronica "};
         
         Lista=new JComboBox(carreras);//SE CREA LA LISTA DE CARRERA
         Lista.setBounds(100, 200, 180, 30);//SE POSICIONA 
         
         panel.add(Lista);//SE AGREGA AL PANEL
         //____________________________________________________________________________
         Area=new JTextArea();//SE CREA EL AREA DE TEXTO DONDE SE GUARDARAN LOS DATOS
         
         Area.setBounds(100, 280, 500, 300);//SE POSICIONA
         Area.setBackground(Color.cyan);//SE DEFINE UN COLOR
         panel.add(Area);//SE AGREGA AL PANEL
         //_____________________________________________________________
         Agregar=new JButton("Agregar");//SE CREAN LOS BOTONES 
         eliminar=new JButton("Eliminar");
         Agregar.setBounds(400,180, 100, 20);
         eliminar.setBounds(400,220, 100, 20);//SE POSICIONAN
         panel.add(Agregar);//se agregan al panel
         panel.add(eliminar);
         Agregar.addActionListener(EscA);//se les agregan las funcines a los botones 
         eliminar.addActionListener(escE);
         
 }
     //se crean las acciones  de los botones 
  ActionListener EscA=new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            
           // Area.setText("\n Cuenta:"+caja1.getText()+"\nNombre:"+caja2.getText()+" "+caja3.getText()+"\nCarrera:"+Lista.getSelectedItem().toString());
            
            Area.append("\n Cuenta:"+caja1.getText()+"\nNombre:"+caja2.getText()+" "+caja3.getText()+"\nCarrera:"+Lista.getSelectedItem().toString());
               }
      
  };   
     
  ActionListener escE=new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            Area.setText(null);
        }
      
      
  };
  
}

