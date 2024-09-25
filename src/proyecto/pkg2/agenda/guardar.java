
package proyecto.pkg2.agenda;


public class guardar {
    private int tel;
    private String nom,correo;

    public guardar(int tel, String nom, String correo) {
        this.tel = tel;
        this.nom = nom;
        this.correo = correo;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
