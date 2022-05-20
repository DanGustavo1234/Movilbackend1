/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import com.cordova.movilbackend1.Movilbackend1;
import com.cordova.movilbackend1.dao.EmailRepository;
import com.cordova.movilbackend1.dao.PersonRepository;
import com.cordova.movilbackend1.dao.PhoneRepository;
import com.cordova.movilbackend1.dao.direccionRepository;
import com.cordova.movilbackend1.enums.EstadoCivil;
import com.cordova.movilbackend1.enums.Sexo;
import com.cordova.movilbackend1.model.Direccion;
import com.cordova.movilbackend1.model.Email;
import com.cordova.movilbackend1.model.Person;
import com.cordova.movilbackend1.model.Phone;
import java.util.Calendar;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 *
 * @author danyg
 */
@SpringBootTest
@ContextConfiguration(classes = Movilbackend1.class)
public class Tests {
    
    @Autowired 
    private PersonRepository personRepository;
    
    @Autowired
    private direccionRepository DireccionRepository;
    
    @Autowired
    private EmailRepository emailRepository;
    
    @Autowired
    private PhoneRepository phoneRepository;
    
    @Test
    public void testing(){
        
        Calendar fecha = Calendar.getInstance();
       fecha.set(1981, 1, 1);
       
       Person persona = new Person();
       persona.setCedula("1105623589");
       persona.setNombres("Diego Palacios");
       persona.setFechaNacimiento(fecha.getTime());
       persona.setEstadoCivil(EstadoCivil.SOLTERO);
       persona.setSexo(Sexo.HOMBRE);
       
       personRepository.save(persona);
       
        Phone telefono = new Phone();
       telefono.setPerson(persona);
       telefono.setTelefono("0963373265");
       
       phoneRepository.save(telefono);
//       
        Email correo = new Email();
       
       correo.setPerson(persona);
       correo.setEmail("dacordova1234@gmail.com");
//       
       emailRepository.save(correo);
       
        Direccion direccion = new Direccion();
       
       direccion.setPerson(persona);
       direccion.setDireccion("El sagrario");
       
        DireccionRepository.save(direccion);
       
        
    }
    
    
    
    
}
