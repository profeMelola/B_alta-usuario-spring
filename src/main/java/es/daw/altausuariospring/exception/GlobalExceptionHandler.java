package es.daw.altausuariospring.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * Gestión centralizada de errores de toda la apliación
 * Spring detecta la clase por la anotación @ControllerAdvice. Cuando se propaga una excepción
 * (listener) mira a ver si hay un manejador para esa excepción...
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    public String gestionarErrorFichero(FicheroNoEncontradoException ex, Model model) {
        model.addAttribute("mensajeError", ex.getMessage());
        return "error"; // plantilla html
    }
}
