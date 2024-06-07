package src;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int parametroUm = leitor.nextInt();
        int parametroDois = leitor.nextInt();

        try {

            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception){
            System.out.print("o segundo parametro deve ser maior que o primeiro!!");
        }

        }

        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

            if(parametroUm > parametroDois){
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
            }else {
                int contagem = parametroDois - parametroUm;
                for (int i = 0; i < contagem; i++){
                    System.out.print("\nImprimindo o numero " + i);
                }
            }

        }
    }
