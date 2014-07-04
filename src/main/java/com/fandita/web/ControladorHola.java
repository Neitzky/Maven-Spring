/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fandita.web;

import java.util.ArrayList;
import javafx.application.Application;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/hola2")
public class ControladorHola {
    
    @RequestMapping(value="/mensaje", 
            method=RequestMethod.GET,headers = {"Accept=text/html"})
public @ResponseBody String algo() {

String facil="Mi primer servicio en java con REST y spring";
return facil;
}


@RequestMapping(value="/mensaje", method=RequestMethod.GET,
                headers={"Accept=Application/json"})
@ResponseBody ArrayList<Usuario> mijason(){
    
ObjectMapper mapeadorjson= new ObjectMapper();
return DAOUsuarioImpl.obtenerUsuario();
}


}