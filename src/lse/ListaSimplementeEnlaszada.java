package lse;

public class ListaSimplementeEnlaszada {
    protected Nodo primero;

    public ListaSimplementeEnlaszada(){
        //inicializar lista vacia
        setPrimero(null);
    }
    public boolean estaVacia(){
        return getPrimero() ==null;//== es pregunta
    }
    public void insertar(Object dato){
        if(estaVacia()){
            Nodo nuevo=new Nodo(dato,null);
            setPrimero(nuevo);
        }else{
            Nodo nuevo=new Nodo(dato, getPrimero());
            setPrimero(nuevo);
        }
    }
    public void eliminar(){
        if(!estaVacia()){
            Nodo aux= getPrimero().getSiguiente();
            setPrimero(aux);
        }
    }
    public void mostrar(){
        Nodo aux= getPrimero();
        while(aux!=null){
            System.out.print(aux.getDato()+"   ");
            aux=aux.getSiguiente();
        }
        System.out.println();
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
}
