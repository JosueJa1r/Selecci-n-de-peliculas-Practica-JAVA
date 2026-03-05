package com.aluracursos.screenmatch.exepcion;

public class ErrorEnConversionExcention extends RuntimeException {
    private String mensaje;

    public ErrorEnConversionExcention(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
