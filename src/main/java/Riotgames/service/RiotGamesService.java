package Riotgames.service;

import Riotgames.api.OpenRiotGamesApiClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RiotGamesService {
    List<String> player_log =null;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    OpenRiotGamesApiClient openRiotGamesApiClient;


}
