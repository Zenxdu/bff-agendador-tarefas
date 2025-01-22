package com.zenxdu.bffagendadortarefas.business;


import com.zenxdu.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import com.zenxdu.bffagendadortarefas.infrastructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient emailClient;

    public void enviaEmail(TarefasDTOResponse dto){
        emailClient.enviaEmail(dto);
    }

}

