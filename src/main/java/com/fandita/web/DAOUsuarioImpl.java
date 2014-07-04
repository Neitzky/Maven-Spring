/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fandita.web;

/**
 *
 * @author T107
 */

import java.util.*;

public class DAOUsuarioImpl {
    
    public static ArrayList<Usuario> obtenerUsuario(){
        
        ArrayList<Usuario> us=new ArrayList<Usuario>();
        Usuario u1 =new Usuario("Jcampos, xxx, y");
        Usuario u2 =new Usuario("Aldo, yyy, x");
        Usuario u3 =new Usuario("Fany, zzz, z");
        
        us.add(u1);
        us.add(u2);
        us.add(u3);
       
        
        return null;
       
        
        
        
    }

}