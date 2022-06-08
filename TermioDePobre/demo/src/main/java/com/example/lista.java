package com.example;

import java.util.ArrayList;

public class lista {

    static String palavra;
    static public void teste(){ 
        
        String testando = "ácaro águia arara aratu atobá bagre betta bilby bisão cabra calau carpa cação cervo chita cisne coala cobra corvo craca crina cupim curió cutia dingo furão gambá ganso garra garça gibão grilo guará hiena iaque irara larva lebre lesma lhama lince mamba morsa mosca ocapi ostra panda pavão peixe polvo pombo porco potro pulga píton pônei quati quivi ratel sabiá sagui saiga tigre touro traça truta urubu urutu veado vespa xexéu zebra";
        String[] testess = testando.split(" ");
        int a = (int) (Math.random() * 72);
        palavra = testess[a];
    }
    
}
