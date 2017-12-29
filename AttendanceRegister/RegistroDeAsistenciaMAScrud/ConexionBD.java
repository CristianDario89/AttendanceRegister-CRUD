
package RegistroDeAsistenciaMAScrud;
import java.sql.*;

public class ConexionBD {
    Connection cn;  //inicializar
    
public Connection conexion(){
    try{
    Class.forName("org.gjt.mm.mysql.Driver"); //especificamos el uso d mysql
    cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema","root","MIfuturama89"); //especificamos la ruta,us y pass a nuestra var d tipo conection
    System.out.print("Se hizo la conexion correcta"); //mandar msj a la bd
    }catch(Exception e){
    System.out.print("Se hizo la conexion correcta");
    }return cn;
}

Statement createStatement(){ //
    throw new UnsupportedOperationException("no soportado");
}
}
