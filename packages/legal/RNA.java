package legal;
import java.util.ArrayList;
import modelovehiculos.Camion;

public class RNA {
    public final String ID="Mendoza";
    ArrayList<Titulo>titulos = new ArrayList<>();
    
    public void registrar(Titulo t){
        titulos.add(t);
        t.rna=this
    }
}

public void mostrar(){
    for (int=0, i<titulos.size(),i++){
        Titulo t=titulos.get(i);
        System.out.println(t.prop);
    }
}