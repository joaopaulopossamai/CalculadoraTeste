public class Main {
    public static void main(String[] args) {

    // vamos ligar o java com a tela.
    // vamos colocar aqui qual tela vai ser executada

        FormCalculadora form = new FormCalculadora();

        // vai indicar qual Pane vai carregar
        form.setContentPane(form.panelMain);
        form.setVisible(true);
        form.setSize(300,500);


    }
}