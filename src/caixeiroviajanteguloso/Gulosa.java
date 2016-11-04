/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixeiroviajanteguloso;

/**
 *
 * @author ogarcia
 */
public class Gulosa {
    private double[][] custos;
    private int[] rota;
    private int[][] coordenadas;
    private int ponto_partida;

    public Gulosa(double[][] custos, int[] rota, int[][] coordenadas, int ponto_partida) {
        this.custos = custos;
        this.rota = rota;
        this.coordenadas = coordenadas;
        this.ponto_partida = ponto_partida;
    }
    
    
}
