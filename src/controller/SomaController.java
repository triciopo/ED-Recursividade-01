// 1. Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros número NATURAIS
// (a função deve retornar zero para números negativos)

package controller;

public class SomaController {
    public int soma(int a) {
      // Condição de parada: número se aproximando do zero (neutro na soma) e dos números negativos.
      if (a < 1) {
          return 0;
      }
      return a + soma(a-1);
    }
}
