import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        //Declarar variables
        int numProductos;
        double totalCompra = 0;
        int productosRegistrados = 0;
        int valorProducto; 
        String nombrePro;
        double iva = 0;

        //Instanciar clases
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de los productos a comprar: ");
        numProductos= lectura.nextInt();

        //Crear la condición
        while(productosRegistrados < numProductos){
        System.out.println("Digite el nombre del producto");
        nombrePro = lectura.next();
            System.out.println("Ingrese el valor del producto: ");
            valorProducto = lectura.nextInt();

            totalCompra =  valorProducto + totalCompra;
            productosRegistrados = productosRegistrados + 1;

        }

        iva = totalCompra * 0.19;
        totalCompra = totalCompra + iva;
        
        System.out.println("El total de su compra es: " + totalCompra);

        //Limpiar el buffer
        lectura.close();

    }
}
