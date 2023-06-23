package auto;


public class Auto {

    private String matricula;
    private String modelo;
    private String color;
    private String marca;
    private double precio;

    public Auto(String matricula, String modelo, String color, String marca, double precio) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }
    
    public String toString()
    {
        return "Matricula: "+ this.matricula + "Modelo: "+ this.modelo + "Color:"+ this.color + "Marca: "+ this.marca+ "Precio: " + this.precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
    
    
}
