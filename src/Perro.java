public class Perro {

   private int Edad, NumeroTelefono;
   private String Nombre, NombreDueno, Raza, Genero, Tamano;



   public int getEdad() {
      return Edad;
   }

   public void setEdad(int edad) {
      Edad = edad;
   }

   public int getNumeroTelefono() {
      return NumeroTelefono;
   }

   public void setNumeroTelefono(int numeroTelefono) {
      NumeroTelefono = numeroTelefono;
   }

   public String getNombre() {
      return Nombre;
   }

   public void setNombre(String nombre) {
      Nombre = nombre;
   }

   public String getRaza() {
      return Raza;
   }

   public void setRaza(String raza) {
      Raza = raza;
   }

   public String getGenero() {
      return Genero;
   }

   public void setGenero(String genero) {
      Genero = genero;
   }

   public String getTamano() {
      return Tamano;
   }

   public void setTamano(String tamano) { Tamano = tamano;}

   public String getNombreDueno() {
      return NombreDueno;
   }

   public void setNombreDueno(String nombreDueno) {
      NombreDueno = nombreDueno;
   }

   public String Ladrar()
   {
       return "guau guau";

   }

   public String Comer (String TipoComida, Double CantidadGramos){

       return "a";

   }

}

