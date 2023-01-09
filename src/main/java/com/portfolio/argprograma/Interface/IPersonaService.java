package com.portfolio.argprograma.Interface;

import com.portfolio.argprograma.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    
   public List<Persona> getPersona();
   
   
   public void savePersona(Persona persona);
   
   
   public void deletePersona(Long id);
   
   
   public Persona findPersona(Long id);
}
