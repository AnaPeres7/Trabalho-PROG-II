/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Modelo.Administrador;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CC12655122992
 */
public class DAOTest {
    
    public DAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        Administrador adm = new Administrador();
        DAO<Administrador> dao= new DAO(Administrador.class);
        dao.insert(adm);
        
    }
    @Test 
    public void testListar(){
        List<Administrador>lista = new DAO (Administrador.class).listarTodos();
        for(Administrador adm : lista){
            System.out.println(adm);
        }
    }
    
}
