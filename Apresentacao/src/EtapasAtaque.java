public enum EtapasAtaque {

    PREPARAR("Preparar"),
    CARREGAR("Carregar"),
    APONTAR("Apontar"),
    FOGO("Fogo!");

    private String value;

    EtapasAtaque(String value){
        this.value=value;
    }

    public String getValue(){
        return this.value;
    }
}
