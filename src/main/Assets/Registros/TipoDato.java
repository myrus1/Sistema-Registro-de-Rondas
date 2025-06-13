package main.Assets.Registros;

public enum TipoDato {
    ENTERO {
        @Override
        public Object parse(String valor) {
            return Integer.parseInt(valor);
        }

        @Override
        public boolean esValido(Object valor) {
            return valor instanceof Integer;
        }
    },
    FLOTANTE {
        @Override
        public Object parse(String valor) {
            return Float.parseFloat(valor);
        }

        @Override
        public boolean esValido(Object valor) {
            return valor instanceof Float;
        }
    },
    STRING{
        @Override
        public Object parse(String valor) {
            return valor;
        }

        @Override
        public boolean esValido(Object valor) {
            return valor instanceof String;
    }
    };

    public abstract Object parse(String valor);
    public abstract boolean esValido(Object valor);
}
