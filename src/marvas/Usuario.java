package marvas;

/**
 *
 * @author Lozano Carvajal
 */
public class Usuario {
    
    private String nombre;
    private String codigo;
    private String tipoUsuario;

    public Usuario(String nombre, String codigo, String tipoUsuario) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipoUsuario = tipoUsuario;
    }
    
    public Usuario(){
    
        this.nombre = " ";
        this.codigo = " ";
        this.tipoUsuario = " ";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }   
}
