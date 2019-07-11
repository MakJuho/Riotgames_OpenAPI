package Riotgames.api;

import Riotgames.domain.CurrentUserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenRiotGamesApiClient {

    private final String api_key = "RGAPI-4f25729b-7de4-4e11-9d64-86f896cd41e5";
    private final String openRiotGamesUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{nickName}?api_key={api_key}";

    @Autowired
    RestTemplate restTemplate;

    public CurrentUserInfo requestUserInfo(String userName){
        return restTemplate.exchange(openRiotGamesUrl, HttpMethod.GET, null, CurrentUserInfo.class, userName, api_key)
                .getBody();
    }

//    {
//        "profileIconId": 4099,
//            "name": "프레이꺼",
//            "puuid": "WStp-LrrzkiVUiZhTtH7aempANeyx4DwCYXZr7LyteAFCxYLNEfJnOKxTjPHttIi385kRPiGJQVKQA",
//            "summonerLevel": 189,
//            "accountId": "peBG_Ie32daDm6rcb4GeN9X4S0Ki8jhLU6QpegjvOJZg",
//            "id": "znbkO4iuAvaGdiIOUi8UhRfQHihGXaGGPh9lJcbT8ai36Q",
//            "revisionDate": 1562533770000
//    }

//    {
//        "championLevel": 4,
//            "chestGranted": false,
//            "championPoints": 17793,
//            "championPointsSinceLastLevel": 5193,
//            "championPointsUntilNextLevel": 3807,
//            "summonerId": "znbkO4iuAvaGdiIOUi8UhRfQHihGXaGGPh9lJcbT8ai36Q",
//            "tokensEarned": 0,
//            "championId": 429,
//            "lastPlayTime": 1560781457000
//    },


//    {
//        "lane": "BOTTOM",
//            "gameId": 3741028996,
//            "champion": 222,
//            "platformId": "KR",
//            "timestamp": 1562556197411,
//            "queue": 440,
//            "role": "DUO_CARRY",
//            "season": 13
//    },
}
