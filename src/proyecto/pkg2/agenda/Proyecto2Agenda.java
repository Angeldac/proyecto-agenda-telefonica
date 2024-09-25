
package proyecto.pkg2.agenda;


public class Proyecto2Agenda {

    
    public static void main(String[] args) {
        ventana ag = new ventana();
       ag.setTitle("agenda");
       ag.setBounds(500,100, 700,600);
       ag.setResizable(false);
       ag.textos();
       ag.insertarEtiquetas();
       ag.inserpanel();
       ag.insertarBotones();
    }
     
}
