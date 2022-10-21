package Personas;
import java.util.*;

public class ListaPersonas {
Vector<Persona> listaPersonas; 

public ListaPersonas() {
listaPersonas = new Vector<Persona>(); 
}

public void añadirPersona(Persona p) {
	listaPersonas.add(p);
	}

	public void eliminarPersona(int i) {
	listaPersonas.removeElementAt(i);
	}
	
	public void borrarLista() {
	listaPersonas.removeAllElements();
	}
	}