package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Asapdemy {

    public List<Usuario> usuarios;
    public List<Categoria> categorias;
    public List<Curso> cursos;

    public Asapdemy() {
        this.usuarios = new ArrayList<>();
        this.categorias = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    private Usuario buscarUsuario(int usuarioId) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsuarioId() == usuarioId) {
                return usuario;
            }
        }
        return null;
    }

    private Curso buscarCurso(int cursoId) {
        for (Curso curso : cursos) {
            if (curso.getCursoId() == cursoId) {
                return curso;
            }
        }
        return null;
    }

    public Resultado suscribirseACurso(int usuarioId, int cursoId){
        Usuario usuario = buscarUsuario(usuarioId);
        if (usuario == null) {
            return Resultado.USUARIO_INEX;
        }

        Curso curso = buscarCurso(cursoId);
        if (curso == null) {
            return Resultado.CURSO_INEX;
        }

        if (curso.estaSuscripto(usuario)) {
            return Resultado.YA_SUSCRIPTO;
        }

        if (curso.getAutor().getUsuarioId() == usuarioId) {
            return Resultado.ES_AUTOR;
        }

        if (usuario.isEsBecado() && curso.cuposBecadosLleno()) {
            return Resultado.MAX_BECADOS;
        }

        curso.suscribir(usuario);
        return Resultado.SUSCRIPTO_OK;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarResultadoAlSuscribirseACurso(int usuarioId, int cursoId) {
        Resultado resultado = suscribirseACurso(usuarioId, cursoId);
        switch (resultado) {
            case CURSO_INEX:
                System.out.println("El curso no existe.");
                break;
            case USUARIO_INEX:
                System.out.println("El usuario no existe.");
                break;
            case YA_SUSCRIPTO:
                System.out.println("El usuario ya está suscripto en el curso.");
                break;
            case ES_AUTOR:
                System.out.println("El usuario es el autor del curso.");
                break;
            case MAX_BECADOS:
                System.out.println("El curso ya cuenta con el máximo de becados posible.");
                break;
            case SUSCRIPTO_OK:
                System.out.println("El usuario se suscribió exitosamente al curso.");
                break;
        }
    }


}
