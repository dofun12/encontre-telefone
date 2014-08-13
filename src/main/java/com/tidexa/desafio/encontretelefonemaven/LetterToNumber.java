/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tidexa.desafio.encontretelefonemaven;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kevim
 */
public class LetterToNumber {

    private Map<String, Integer> letras;

    public LetterToNumber() {
        letras = new HashMap<String, Integer>();
        letras.put("abc", 2);
        letras.put("def", 3);
        letras.put("ghi", 4);
        letras.put("jkl", 5);
        letras.put("mno", 6);
        letras.put("pqrs", 7);
        letras.put("tuv", 8);
        letras.put("wxyz", 9);

    }
    
    private Integer getLetra(char letra) {
        for (String grupo : letras.keySet()) {
            for (char c : grupo.toCharArray()) {
                if (c == letra) {
                    return letras.get(grupo);
                }
            }
        }
        return null;
    }

    public String toNumbers(String phrase) {
        phrase = phrase.toLowerCase();
        String result = "";
        for (char c : phrase.toCharArray()) {
            Integer num = getLetra(c);
            if (num != null) {
                result += num;
            } else {
                result += c;
            }

        }
        return result;
    }

}
