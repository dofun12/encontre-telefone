package com.tidexa.desafio.encontretelefonemaven.tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tidexa.desafio.encontretelefonemaven.LetterToNumber;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevim
 */
public class MainTest {
    
    private LetterToNumber ltn;
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ltn = new LetterToNumber();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void compararLetras(){
        assertEquals(ltn.toNumbers("1-HOME-SWEET-HOME"),"1-4663-79338-4663");
    }
    
    @Test
    public void compararLetrasMaiusculasEMinusculas(){
        assertEquals(ltn.toNumbers("1-HomE-SweeT-HomE"),"1-4663-79338-4663");
    }
    
    @Test
    public void compararComSimbolos(){
        assertEquals(ltn.toNumbers("1==*-ç374234234728724HomE-SweeT-HomE"),"1==*-ç3742342347287244663-79338-4663");
    }
    
    @Test
    public void testarFraseGrande(){
        assertEquals(ltn.toNumbers("The quick brown fox jumps over the lazy dog"),"843 78425 27696 369 58677 6837 843 5299 364");
    }
    
    
}
