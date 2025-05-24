package co.edu.umanizales.myfirstapi.controler;

import co.edu.umanizales.myfirstapi.model.Parameter;
import co.edu.umanizales.myfirstapi.service.ParameterService;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parameters")
public class ParameterController {

    private ParameterService parameterService = new ParameterService();

    @PostMapping
    public void addParameter(@RequestBody Parameter parameter) {
        parameterService.addParameter(parameter);
    }

    @GetMapping
    public List<Parameter> getAllParameters() {
        return parameterService.getAllParameters();
    }

    @GetMapping("/type")
    public Parameter getParameterByType(@RequestParam String type) {
        return (Parameter) parameterService.getParameterByType(type);
    }

    @GetMapping("/code/{code}")
    public Parameter getParameterByCode(@PathVariable String code) {
        return parameterService.getParameterByCode(code);
    }
}