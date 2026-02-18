/*8. Agenda de contactos con varios teléfonos por persona
Problema:
Permitir que cada nombre de contacto tenga varios números de teléfono
asociados.
 */
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class AgendaContactos {
    public static void main(String[] args) {
        // Usamos un HashMap donde la clave es el nombre y el valor es una lista de teléfonos
        Map<String, Set<String>> agenda = new HashMap<>();

        //Agregar claves - valor
        agregarContacto(agenda, "Ana", "123456");
        agregarContacto(agenda, "Luis", "654321");
        agregarContacto(agenda,"Maria",  "789456");
        agregarContacto(agenda, "Ana", "111111");

        for (String nombre : agenda.keySet()) {
            System.out.println(nombre + " " + agenda.get(nombre));
            }
        }
        public static void agregarContacto (Map<String, Set<String>> agenda, String nombre , String telefono) {
            agenda.putIfAbsent(nombre, new HashSet<>());
            agenda.get(nombre).add(telefono);
        }

    }
