/*
		
		Objetivo:      Fazer uma aplicação que insira números
				       aleatórios em uma matriz 3 x 5 e tenha 3
                       Threads, onde cada Thread calcula a soma dos
                       valores de cada linha, imprimindo a identificação
                       da linha e o resultado da soma.


		Programador(a): Sarah Cardoso	
		Data: 09-05-2019
*/


package view;
import controller.Soma;

public class Main {
	public static void main(String[] args) {
		
		    for (int i = 0; i < 3; i++) {
				Thread soma = new Soma(i);
				soma.start();
			}
		}
	}

