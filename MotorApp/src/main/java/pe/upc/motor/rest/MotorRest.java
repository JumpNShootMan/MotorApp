package pe.upc.motor.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.upc.motor.entities.Motor;
import pe.upc.motor.repositories.MotorRepositorio;

@RestController
@RequestMapping("/api")
public class MotorRest {

    @Autowired
    private MotorRepositorio motorRepositorio;

    @GetMapping("/motores")
    public List<Motor> lista() {
        return motorRepositorio.findAll();
    }
    @PostMapping("/motor")
    public Motor registrar(@RequestBody Motor motor){
        return motorRepositorio.save(motor);
    }
    @GetMapping("/motores/{v1}/{v2}")
    public List<Motor> obtenerListadoNombre(@PathVariable(value = "v1")  Double v1, @PathVariable(value = "v2") Double v2){
        return motorRepositorio.obtenerMotoresEntrePrecios(v1, v2);
    }
}
