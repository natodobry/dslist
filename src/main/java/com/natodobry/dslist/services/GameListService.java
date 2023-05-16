package com.natodobry.dslist.services;

import com.natodobry.dslist.dto.GameDTO;
import com.natodobry.dslist.dto.GameListDTO;
import com.natodobry.dslist.dto.GameMinDTO;
import com.natodobry.dslist.entities.Game;
import com.natodobry.dslist.entities.GameList;
import com.natodobry.dslist.repositories.GameListRepository;
import com.natodobry.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.StyledEditorKit;
import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
        //te amo nene sabia que esses comandos que aparecem se chamam typescript? eu sei hehe

    }
}
