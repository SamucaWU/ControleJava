package ControlPast;
public class Controle {
    public static void main(String[] args) throws Exception {
        // chamar classe "ControleRemoto"
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.menosVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}
