package view;

import controller.SomaController;

public class SomaView {
    public static void main(String[] args) {
        SomaController somaController = new SomaController();

        System.out.println(somaController.soma(-1));
    }
}
