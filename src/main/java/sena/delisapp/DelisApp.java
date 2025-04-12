/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sena.delisapp;

import java.util.List;
import sena.delisapp.clases.Usuario;
import sena.delisapp.gestion_usuarios.GestionUsuarios;

/**
 *
 * @author jseba
 */
public class DelisApp {

    public static void main(String[] args) {
        GestionUsuarios gestion = new GestionUsuarios();

        // Ejemplo de inserción
        Usuario nuevoUsuario = new Usuario("Ana Pérez", "ana.perez@example.com", "3101234567");
        if (gestion.insertarUsuario(nuevoUsuario)) {
            System.out.println("Usuario insertado correctamente.");
        } else {
            System.out.println("Error al insertar usuario.");
        }

        // Ejemplo de consulta por ID
        Usuario usuarioConsultado = gestion.consultarUsuario(1);
        if (usuarioConsultado != null) {
            System.out.println("Usuario con ID 1: " + usuarioConsultado);
        } else {
            System.out.println("Usuario con ID 1 no encontrado.");
        }

        // Ejemplo de consulta de todos los usuarios
        List<Usuario> todosUsuarios = gestion.consultarTodosUsuarios();
        System.out.println("Todos los usuarios:");
        for (Usuario usuario : todosUsuarios) {
            System.out.println(usuario);
        }

        // Ejemplo de actualización
        if (usuarioConsultado != null) {
            usuarioConsultado.setTelefono("3159876543");
            if (gestion.actualizarUsuario(usuarioConsultado)) {
                System.out.println("Usuario actualizado correctamente.");
            } else {
                System.out.println("Error al actualizar usuario.");
            }
        }

        // Ejemplo de eliminación
        if (gestion.eliminarUsuario(2)) {
            System.out.println("Usuario con ID 2 eliminado correctamente.");
        } else {
            System.out.println("Error al eliminar usuario con ID 2.");
        }
    }
}
