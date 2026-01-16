package teoria.lombok.ENER14;

public class MainProducto {
    public static void main(String[] args){
        //Producto 1
        Producto producto1 = new Producto("Discos de Algodon",3.5, CategoriaProducto.Drogueria);
        System.out.println(producto1);

        //Producto 2
        Producto producto2 = new Producto();
        producto2.setNombreProducto("Hamburguesas de pollo");
        producto2.setCategoriaProducto(CategoriaProducto.Alimentacion);
        producto2.setPrecioProducto(4.86);
        System.out.println(producto2);

        //Producto 3
        Producto producto3 = new Producto("Camiseta de Cuadros", 15.2, CategoriaProducto.Varios);
        System.out.println(producto3);
    }
}
