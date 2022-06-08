package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class wordle {

    @FXML
    private Label L1P1;

    @FXML
    private Label L1P2;

    @FXML
    private Label L1P3;

    @FXML
    private Label L1P4;

    @FXML
    private Label L1P5;

    @FXML
    private Label L2P1;

    @FXML
    private Label L2P2;

    @FXML
    private Label L2P3;

    @FXML
    private Label L2P4;

    @FXML
    private Label L2P5;

    @FXML
    private Label L3P1;

    @FXML
    private Label L3P2;

    @FXML
    private Label L3P3;

    @FXML
    private Label L3P4;

    @FXML
    private Label L3P5;
    @FXML
    private Label L4P1;

    @FXML
    private Label L4P2;

    @FXML
    private Label L4P3;

    @FXML
    private Label L4P4;

    @FXML
    private Label L4P5;

    @FXML
    private Label L5P1;

    @FXML
    private Label L5P2;

    @FXML
    private Label L5P3;

    @FXML
    private Label L5P4;

    @FXML
    private Label L5P5;

    @FXML
    private TextField tentativa;

    @FXML
    private Button botao;

    @FXML 
    private Label clock;

    public String tenta;
    public int tentativas;
    
    public String palavra = lista.palavra;

    public int contador;

    time time = new time("00:00");

    Timeline timeline = new Timeline(
        new KeyFrame(Duration.seconds(1),
        e -> {
            time.oneSecondPassed();
            clock.setText(time.getCurrentTime());
        }
        )
    );


    @FXML
    void resetar(ActionEvent event) throws IOException {
        App.setRoot("wordle");
    }

    @FXML 
    void initialize(){
        lista.teste();
        System.out.println(lista.palavra);

        clock.setText(time.getCurrentTime());
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    @FXML
    void tent(ActionEvent event) throws IOException {
        
        tenta = tentativa.getText();
        tenta = tenta.toLowerCase();
        teste();
        tentativas ++; 
        if (contador == 5){
            tentativa.setDisable(true);
            tentativa.setVisible(false);
            botao.setVisible(true);
            timeline.stop();

        } 
        

        
    }
    void teste(){
        String A = tenta.charAt(0) + "";
        String B = tenta.charAt(1) + "";
        String C = tenta.charAt(2) + "";
        String D = tenta.charAt(3) + "";
        String E = tenta.charAt(4) + "";

        switch (tentativas) {
            case 0:
                contador = 0;

                if (tenta.charAt(0) == lista.palavra.charAt(0) ){
                    contador++;
                   L1P1.setText(A);
                   L1P1.setStyle("-fx-background-color: #00FF00;");
                }else if (lista.palavra.contains(A)== true){
                    L1P1.setText(A);
                    L1P1.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L1P1.setText(A);
                    L1P1.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(1) == lista.palavra.charAt(1) ){
                    contador++;
                    L1P2.setText(B);
                    L1P2.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(B)== true){
                    L1P2.setText(B);
                    L1P2.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L1P2.setText(B);
                    L1P2.setStyle("-fx-background-color: #FF0000;");
                }

                if (tenta.charAt(2) == lista.palavra.charAt(2) ){
                    contador++;
                    L1P3.setText(C);
                    L1P3.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(C)== true){
                    L1P3.setText(C);
                    L1P3.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L1P3.setText(C);
                    L1P3.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(3) == lista.palavra.charAt(3) ){
                    contador++;
                    L1P4.setText(D);
                    L1P4.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(D)== true){
                    L1P4.setText(D);
                    L1P4.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L1P4.setText(D);
                    L1P4.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(4) == lista.palavra.charAt(4) ){
                    contador++;
                    L1P5.setText(E);
                    L1P5.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(E)== true){
                    L1P5.setText(E);
                    L1P5.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L1P5.setText(E);
                    L1P5.setStyle("-fx-background-color: #FF0000;");
                }
                
                
                
                break;
                case 1:
                contador = 0;

                if (tenta.charAt(0) == lista.palavra.charAt(0) ){
                    contador++;
                   L2P1.setText(A);
                   L2P1.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(A)== true){
                    L2P1.setText(A);
                    L2P1.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L2P1.setText(A);
                    L2P1.setStyle("-fx-background-color: #FF0000;");
                }

                if (tenta.charAt(1) == lista.palavra.charAt(1) ){
                    contador++;
                    L2P2.setText(B);
                    L2P2.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(B)== true){
                    L2P2.setText(B);
                    L2P2.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L2P2.setText(B);
                    L2P2.setStyle("-fx-background-color: #FF0000;");
                }

                if (tenta.charAt(2) == lista.palavra.charAt(2) ){
                    contador++;
                    L2P3.setText(C);
                    L2P3.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(C)== true){
                    L2P3.setText(C);
                    L2P3.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L2P3.setText(C);
                    L2P3.setStyle("-fx-background-color: #FF0000;");
                }

                if (tenta.charAt(3) == lista.palavra.charAt(3) ){
                    contador++;
                    L2P4.setText(D);
                    L2P4.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(D)== true){
                    L2P4.setText(D);
                    L2P4.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L2P4.setText(D);
                    L2P4.setStyle("-fx-background-color: #FF0000;");
                }
                
                if (tenta.charAt(4) == lista.palavra.charAt(4) ){
                    contador++;
                    L2P5.setText(E);
                    L2P5.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(E)== true){
                    L2P5.setText(E);
                    L2P5.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L2P5.setText(E);
                    L2P5.setStyle("-fx-background-color: #FF0000;");
                }
                
                
                
                break;
                case 2:
                contador = 0;

                if (tenta.charAt(0) == lista.palavra.charAt(0) ){
                    contador++;
                   L3P1.setText(A);
                   L3P1.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(A)== true){
                    L3P1.setText(A);
                    L3P1.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L3P1.setText(A);
                    L3P1.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(1) == lista.palavra.charAt(1) ){
                    contador++;
                    L3P2.setText(B);
                    L3P2.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(B)== true){
                    L3P2.setText(B);
                    L3P2.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L3P2.setText(B);
                    L3P2.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(2) == lista.palavra.charAt(2) ){
                    contador++;
                    L3P3.setText(C);
                    L3P3.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(C)== true){
                    L3P3.setText(C);
                    L3P3.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L3P3.setText(C);
                    L3P3.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(3) == lista.palavra.charAt(3) ){
                    contador++;
                    L3P4.setText(D);
                    L3P4.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(D)== true){
                    L3P4.setText(D);
                    L3P4.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L3P4.setText(D);
                    L3P4.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(4) == lista.palavra.charAt(4) ){
                    contador++;
                    L3P5.setText(E);
                    L3P5.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(E)== true){
                    L3P5.setText(E);
                    L3P5.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L3P5.setText(E);
                    L3P5.setStyle("-fx-background-color: #FF0000;");
                }
                
                
                
                break;
                case 3:
                contador = 0;

                if (tenta.charAt(0) == lista.palavra.charAt(0) ){
                    contador++;
                   L4P1.setText(A);
                   L4P1.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(A)== true){
                    L4P1.setText(A);
                    L4P1.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L4P1.setText(A);
                    L4P1.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(1) == lista.palavra.charAt(1) ){
                    contador++;
                    L4P2.setText(B);
                    L4P2.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(B)== true){
                    L4P2.setText(B);
                    L4P2.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L4P2.setText(B);
                    L4P2.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(2) == lista.palavra.charAt(2) ){
                    contador++;
                    L4P3.setText(C);
                    L4P3.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(C)== true){
                    L4P3.setText(C);
                    L4P3.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L4P3.setText(C);
                    L4P3.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(3) == lista.palavra.charAt(3) ){
                    contador++;
                    L4P4.setText(D);
                    L4P4.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(D)== true){
                    L4P4.setText(D);
                    L4P4.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L4P4.setText(D);
                    L4P4.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(4) == lista.palavra.charAt(4) ){
                    contador++;
                    L4P5.setText(E);
                    L4P5.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(E)== true){
                    L4P5.setText(E);
                    L4P5.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L4P5.setText(E);
                    L4P5.setStyle("-fx-background-color: #FF0000;");
                }
               
                
                
                break;
                case 4:
                contador = 0;
                if (tenta.charAt(0) == lista.palavra.charAt(0) ){
                    contador++;
                   L5P1.setText(A);
                   L5P1.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(A)== true){
                    L5P1.setText(A);
                    L5P1.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L5P1.setText(A);
                    L5P1.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(1) == lista.palavra.charAt(1) ){
                    contador++;
                    L5P2.setText(B);
                    L5P2.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(B)== true){
                    L5P2.setText(B);
                    L5P2.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L5P2.setText(B);
                    L5P2.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(2) == lista.palavra.charAt(2) ){
                    contador++;
                    L5P3.setText(C);
                    L5P3.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(C)== true){
                    L5P3.setText(C);
                    L5P3.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L5P3.setText(C);
                    L5P3.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(3) == lista.palavra.charAt(3) ){
                    contador++;
                    L5P4.setText(D);
                    L5P4.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(D)== true){
                    L5P4.setText(D);
                    L5P4.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L5P4.setText(D);
                    L5P4.setStyle("-fx-background-color: #FF0000;");
                }


                if (tenta.charAt(4) == lista.palavra.charAt(4) ){
                    contador++;
                    L5P5.setText(E);
                    L5P5.setStyle("-fx-background-color: #00FF00;");

                }else if (lista.palavra.contains(E)== true){
                    L5P5.setText(E);
                    L5P5.setStyle("-fx-background-color: #FFFF00;");
                }else{
                    L5P5.setText(E);
                    L5P5.setStyle("-fx-background-color: #FF0000;");
                }
               
                
                
                break;
        
            default:
                break;
        }
    } 

}

