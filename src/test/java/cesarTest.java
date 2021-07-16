import org.jaqueria.cesar.Cesar;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class cesarTest{

    private Cesar cesar = new Cesar(3);

    @Test
    public void cifrarTest(){

        String mensaje="Hola Chato";
        String cifrado=cesar.cifrar(mensaje);
        assertNotNull(cifrado);
        assertEquals("Krñd fkdwr", cifrado);
    }

    @Test
    public void cifrarNullTest(){
        String mensaje=null;
        assertThrows(NullPointerException.class, () -> cesar.cifrar(mensaje));
    }

    @Test
    public void descifrarTest(){
        String mensajeCifrado="Frp ñd gh klhuur txh wlhph";
        String descifrado = cesar.descifrar(mensajeCifrado);
        assertNotNull(descifrado);
        assertEquals("Con la de hierro que tiene", descifrado);
    }

    @Test
    public void descifrarNullTest(){
    String mensajeCifrado=null;
        assertThrows(NullPointerException.class, () -> cesar.descifrar(mensajeCifrado));
    }
}