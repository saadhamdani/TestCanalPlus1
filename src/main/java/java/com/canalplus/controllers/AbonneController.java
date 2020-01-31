package java.com.canalplus.controllers;

import com.architecture.canalplus.dao.IAbonneRepository;
import com.architecture.canalplus.model.Abonne;
import com.architecture.canalplus.service.IAbonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Abonne")
public class AbonneController {
    @Autowired
    AbonneService abonneService;
    @Autowired
    AbonneRepository abonneRepository;
    @PutMapping("/UpdateAdresse")
    public ResponseEntity<Abonne> ModifierAdresse(@RequestParam(name = "canal") String canal,
                                                  @RequestParam(name = "adresse")String adresse) {
        Abonne abonne=abonneService.ModifierAdresseAbonne(adresse,canal);
        return new ResponseEntity<>(abonne, HttpStatus.OK);
    }
}