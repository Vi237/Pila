import Pc.Pila;

public class Main {
    public static void main(String[] args){
        /*ListaSimplementeEnlaszada listaSimplementeEnlaszada=new ListaSimplementeEnlaszada();
        //verificando si la lista esta vacia
        System.out.println(listaSimplementeEnlaszada.estaVacia());

        //insertando valores a la lista
        listaSimplementeEnlaszada.insertar(25);
        listaSimplementeEnlaszada.insertar(65);
        listaSimplementeEnlaszada.insertar(25);
        listaSimplementeEnlaszada.insertar(6);

        //mostrando los datos de la lista
        listaSimplementeEnlaszada.mostrar();

        //eliminamos el primer valor
        listaSimplementeEnlaszada.eliminar();
        listaSimplementeEnlaszada.eliminar();

        listaSimplementeEnlaszada.mostrar();
        Cola cola=new Cola();
        System.out.println(cola.estaVacia());
        for (int i = 1; i < 6; i++) {
            cola.insertar(i);
        }
        cola.mostrar();
        cola.eliminar();
        cola.mostrar();*/
        Pila pila=new Pila();
        System.out.println(pila.estaVacia());
        for (int i = 1; i <=8 ; i++) {
            pila.insertar(i);
        }
        pila.mostrar();
        pila.eliminar();
        pila.eliminar();
        pila.mostrar();
    }
}
