package examen.parcial.parcial.services;

import examen.parcial.parcial.Entity.Estudiante;
import examen.parcial.parcial.Repository.EstudanteRepository;
import examen.parcial.parcial.message.Message;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EstudianteService {
    private final EstudanteRepository estudanteRepository;

    public List<Estudiante> findAll(){
        return estudanteRepository.findAll();
    }

    public Optional<Estudiante> findById(long id){
        return estudanteRepository.findById(id);
    }

    public Message saveEstudiante(Estudiante request) {
        this.estudanteRepository.save(request);

        Message message = new Message();
        message.setMessage("Tu usuario se guardo perrooo");

        return  message;
    }

    public Message updateEstudiante(Estudiante request, long id){
        Estudiante estudiante = this.estudanteRepository.findById(id).get();

        estudiante.setNombre(request.getNombre());
        estudiante.setHability(request.getHability());

        this.estudanteRepository.save(estudiante);

        Message message = new Message();
        message.setMessage("Guardado perrooo");

        return  message;
    }
}
