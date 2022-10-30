package ProductosYServicios;

import org.json.JSONObject;

import excepciones.NoHayStockExcepcion;

public abstract class Producto {
    private String codigo;
    private String marca;
    private String modelo;
    private int stock;
    private double precio;
    private double peso;
    private String paisOrigen;
    private boolean rgb;
    private String color;
    private String descripcion;

    public Producto() {
        this.codigo = "";
        this.marca = "";
        this.modelo = "";
        this.stock = 0;
        this.precio = 0;
        this.peso = 0;
        this.paisOrigen = "";
        this.rgb = false;
        this.color = "";
        this.descripcion = "";
    }

    public Producto(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen, boolean rgb, String color, String descripcion) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.stock = stock;
        this.precio = precio;
        this.peso = peso;
        this.paisOrigen = paisOrigen;
        this.rgb = rgb;
        this.color = color;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reducirStock(int cant) throws NoHayStockExcepcion{
    	
    	if(stock>=cant)
    	{
            this.stock=stock-cant;
        }
        else
        {
        	throw new NoHayStockExcepcion("Este producto no tiene stock...\n");
        }
    }
    public void aumentarStock(int cant){
        this.stock=stock+cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "\n\nProducto: "+"\nCodigo: " + codigo +"\nMarca: " + marca +"\nModelo: " + modelo +"\nStock: " + stock +"\nPrecio: "+precio+"\nPeso: "+peso+"\nPaisOrigen: "+paisOrigen +"\nRgb: "+rgb+"\nColor: "+color+"\nDescripcion: "+descripcion+"\n";
    }
    public String detallePedido(){
        return "\nCodigo: " + codigo +"\nMarca=" + marca +"\nModelo:" + modelo +"\nPrecio unitario: "+precio+"\n";
    }

    @Override
    public boolean equals(Object o) {
        boolean igual=false;
        if(o!=null){
            if(o instanceof Producto){
                Producto aux= (Producto) o;
                if(aux.getCodigo().equals(getCodigo())){
                    igual=true;
                }
            }
        }
        return igual;
    }

    @Override
    public int hashCode() {
        return 1;
    }
    
    public abstract JSONObject productoAJson();
    
}
