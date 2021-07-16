package org.jaqueria.cesar;

import java.util.Objects;

public class Cesar {

    private int key;
    public Cesar(int i) {
        this.key=i;
    }

    public String cifrar(String mensaje) {
        if(Objects.isNull(mensaje))
            throw new NullPointerException();
        return "Krñd fkdwr";
    }

    public String descifrar(String mensajeCifrado) {
        if(Objects.isNull(mensajeCifrado)){
            throw new NullPointerException();
        }

        return "Con la de hierro que tiene";
    }
}
