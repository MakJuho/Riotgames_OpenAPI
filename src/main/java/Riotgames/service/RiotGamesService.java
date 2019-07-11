package Riotgames.service;

import Riotgames.api.OpenRiotGamesApiClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.logging.FileHandler;

@Service
@Slf4j
public class RiotGamesService {
    List<String> playerInfo =null;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    OpenRiotGamesApiClient openRiotGamesApiClient;

}
