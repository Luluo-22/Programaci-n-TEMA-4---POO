package teoria.lombok.ENER14;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
//CONSTRUCTORES
@AllArgsConstructor //para que te haga el constructor con todos los datos
@NoArgsConstructor  //para que te haga el constructor sin datos
public class Producto {
    //ATRIBUTOS
    private String nombreProducto;
    private double precioProducto;
    private CategoriaProducto categoriaProducto;

    //toString modificado
    @Override
    public String toString() { return String.format("%s;%.2f;%s", nombreProducto, precioProducto, categoriaProducto); }
}
