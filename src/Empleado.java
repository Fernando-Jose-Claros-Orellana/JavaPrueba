public class Empleado {
private String Nombre;
private int Edad;
private String Email;
public Empleado() {
}
public Empleado(String nombre, int edad, String email) {
    Nombre = nombre;
    Edad = edad;
    Email = email;
}
public String getNombre() {
    return Nombre;
}
public void setNombre(String nombre) {
    Nombre = nombre;
}
public int getEdad() {
    return Edad;
}
public void setEdad(int edad) {
    Edad = edad;
}
public String getEmail() {
    return Email;
}
public void setEmail(String email) {
    Email = email;
}


}
