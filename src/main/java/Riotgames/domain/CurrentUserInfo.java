package Riotgames.domain;

import lombok.Data;

@Data
public class CurrentUserInfo {

    private long profileIconId;
    private String name;
    private String puuid;
    private long summonerLevel;
    private String accountId;
    private String id;
    private long revisionDate;

    private String queueType;
    private Boolean hotStreak;
    private long wins;
    private Boolean veteran;
    private long losses;
    private String rank;
    private String tier;
    private Boolean inactive;
    private Boolean freshBlood;
    private String leagueId;
    private String summonerId;
    private long leaguePoints;

//    [
//    {
//        "queueType": "RANKED_SOLO_5x5",
//            "summonerName": "프레이꺼",
//            "hotStreak": false,
//            "wins": 154,
//            "veteran": true,
//            "losses": 144,
//            "rank": "II",
//            "tier": "GOLD",
//            "inactive": false,
//            "freshBlood": false,
//            "leagueId": "5a5c8060-1fa4-11e9-8ebb-c81f66e41892",
//            "summonerId": "znbkO4iuAvaGdiIOUi8UhRfQHihGXaGGPh9lJcbT8ai36Q",
//            "leaguePoints": 94
//    },
//    {
//        "queueType": "RANKED_FLEX_SR",
//            "summonerName": "프레이꺼",
//            "hotStreak": false,
//            "wins": 55,
//            "veteran": false,
//            "losses": 63,
//            "rank": "IV",
//            "tier": "PLATINUM",
//            "inactive": false,
//            "freshBlood": true,
//            "leagueId": "46c9a930-9e0f-11e9-a277-c81f66e41892",
//            "summonerId": "znbkO4iuAvaGdiIOUi8UhRfQHihGXaGGPh9lJcbT8ai36Q",
//            "leaguePoints": 0
//    }
//]

//    "profileIconId": 4099,
//    "name": "프레이꺼",
//    "puuid": "WStp-LrrzkiVUiZhTtH7aempANeyx4DwCYXZr7LyteAFCxYLNEfJnOKxTjPHttIi385kRPiGJQVKQA",
//    "summonerLevel": 189,
//    "accountId": "peBG_Ie32daDm6rcb4GeN9X4S0Ki8jhLU6QpegjvOJZg",
//    "id": "znbkO4iuAvaGdiIOUi8UhRfQHihGXaGGPh9lJcbT8ai36Q",
//    "revisionDate": 1562533770000
}
