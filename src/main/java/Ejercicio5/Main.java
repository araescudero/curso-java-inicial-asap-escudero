package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Asapdemy
        Asapdemy asapdemy = new Asapdemy();

        // Crear usuarios
        Usuario usuario1 = new Usuario(1, "Juan Pérez", "juan@example.com", true);
        Usuario usuario2 = new Usuario(2, "Ana Gómez", "ana@example.com", false);
        Usuario usuario3 = new Usuario(3, "Carlos Martínez", "carlos@example.com", false);
        Usuario usuario4 = new Usuario(4, "Laura Fernández", "laura@example.com", true);

        // Agregar usuarios a Asapdemy
        asapdemy.agregarUsuario(usuario1);
        asapdemy.agregarUsuario(usuario2);
        asapdemy.agregarUsuario(usuario3);
        asapdemy.agregarUsuario(usuario4);

        // Crear categorías
        Categoria categoria1 = new Categoria(1, "Desarrollo Web");
        Categoria categoria2 = new Categoria(2, "Programación Java");

        // Agregar categorías a Asapdemy
        asapdemy.agregarCategoria(categoria1);
        asapdemy.agregarCategoria(categoria2);

        // Crear cursos
        Curso curso1 = new Curso(1, "Curso de Java Básico", 100.0, 5, usuario1);
        Curso curso2 = new Curso(2, "Curso de Desarrollo Web", 150.0, 4, usuario2);

        // Agregar cursos a Asapdemy
        asapdemy.agregarCurso(curso1);
        asapdemy.agregarCurso(curso2);

        // Crear lecciones
        Leccion leccion1 = new Leccion("Introducción a Java", 30);
        Leccion leccion2 = new Leccion("Sintaxis Básica", 45);
        Leccion leccion3 = new Leccion("HTML y CSS", 40);
        Leccion leccion4 = new Leccion("JavaScript Básico", 50);

        // Agregar lecciones a cursos
        curso1.getLecciones().add(leccion1);
        curso1.getLecciones().add(leccion2);
        curso2.getLecciones().add(leccion3);
        curso2.getLecciones().add(leccion4);

        // Suscribir usuarios a cursos
        asapdemy.mostrarResultadoAlSuscribirseACurso(1, 1); // Juan Pérez se suscribe a Curso de Java Básico
        asapdemy.mostrarResultadoAlSuscribirseACurso(2, 1); // Ana Gómez se suscribe a Curso de Java Básico
        asapdemy.mostrarResultadoAlSuscribirseACurso(3, 2); // Carlos Martínez se suscribe a Curso de Desarrollo Web
        asapdemy.mostrarResultadoAlSuscribirseACurso(4, 2); // Laura Fernández se suscribe a Curso de Desarrollo Web

        // Mostrar detalles de los usuarios
        System.out.println("\nDetalles de los usuarios:");
        for (Usuario usuario : asapdemy.usuarios) {
            System.out.println("ID: " + usuario.getUsuarioId() + ", Nombre: " + usuario.getNombre() + ", Email: " + usuario.getEmail() + ", Becado: " + usuario.isEsBecado());
        }

        // Mostrar detalles de los cursos
        System.out.println("\nDetalles de los cursos:");
        for (Curso curso : asapdemy.cursos) {
            System.out.println("ID: " + curso.getCursoId() + ", Título: " + curso.getTitulo() + ", Precio: " + curso.getPrecio() + ", Valoración: " + curso.getValoracion() + ", Autor ID: " + curso.getAutor().getUsuarioId());
            System.out.println("Suscriptos:");
            for (Usuario suscriptor : curso.getSuscriptos()) {
                System.out.println(" - ID: " + suscriptor.getUsuarioId() + ", Nombre: " + suscriptor.getNombre());
            }
        }

        // Mostrar detalles de las categorías
        System.out.println("\nDetalles de las categorías:");
        for (Categoria categoria : asapdemy.categorias) {
            System.out.println("ID: " + categoria.getCategoriaId() + ", Nombre: " + categoria.getNombre());
        }

        // Mostrar detalles de las lecciones
        System.out.println("\nDetalles de las lecciones:");
        System.out.println("Curso 1 Lecciones:");
        for (Leccion leccion : curso1.getLecciones()) {
            System.out.println(" - Título: " + leccion.getTitulo() + ", Duración: " + leccion.getDuracion() + " minutos");
        }
        System.out.println("Curso 2 Lecciones:");
        for (Leccion leccion : curso2.getLecciones()) {
            System.out.println(" - Título: " + leccion.getTitulo() + ", Duración: " + leccion.getDuracion() + " minutos");
        }
    }
}
