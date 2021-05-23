# TheGuardianJavaApi

The Guardian API adapted for Java

https://open-platform.theguardian.com/documentation/

An example of request and response:

https://content.guardianapis.com/search?show-tags=contributor&show-fields=trailText,thumbnail&api-key=8c3401b3-3022-4849-8781-826bb87826d1&q=sausage&page-size=2

{
    "response": {
        "status": "ok",
        "userTier": "developer",
        "total": 6828,
        "startIndex": 1,
        "pageSize": 2,
        "currentPage": 1,
        "pages": 3414,
        "orderBy": "relevance",
        "results": [
            {
                "id": "science/2021/mar/12/wurst-luck-half-eaten-sausage-helps-german-police-solve-cold-case",
                "type": "article",
                "sectionId": "science",
                "sectionName": "Science",
                "webPublicationDate": "2021-03-12T03:20:11Z",
                "webTitle": "World's wurst burglar: half-eaten sausage helps German police solve nine-year-old burglary ",
                "webUrl": "https://www.theguardian.com/science/2021/mar/12/wurst-luck-half-eaten-sausage-helps-german-police-solve-cold-case",
                "apiUrl": "https://content.guardianapis.com/science/2021/mar/12/wurst-luck-half-eaten-sausage-helps-german-police-solve-cold-case",
                "fields": {
                    "trailText": " Inquiry into 2012 burglary is revived after French police turn up a DNA match for unrelated crime",
                    "thumbnail": "https://media.guim.co.uk/f0ac2d34ae7e47503a6f980b8c13059c9554cfe0/215_2_762_457/500.jpg"
                },
                "tags": [],
                "isHosted": false,
                "pillarId": "pillar/news",
                "pillarName": "News"
            },
            {
                "id": "food/2021/jan/25/thomasina-miers-recipe-for-savoy-cabbage-and-fennel-sausage-lasagne",
                "type": "article",
                "sectionId": "food",
                "sectionName": "Food",
                "webPublicationDate": "2021-01-25T11:00:13Z",
                "webTitle": "Thomasina Miers' recipe for savoy cabbage and fennel sausage 'lasagne' | The simple fix",
                "webUrl": "https://www.theguardian.com/food/2021/jan/25/thomasina-miers-recipe-for-savoy-cabbage-and-fennel-sausage-lasagne",
                "apiUrl": "https://content.guardianapis.com/food/2021/jan/25/thomasina-miers-recipe-for-savoy-cabbage-and-fennel-sausage-lasagne",
                "fields": {
                    "trailText": "A rich and reassuring layered dish of sausage ragu and silky cabbage leaves",
                    "thumbnail": "https://media.guim.co.uk/23a43d05d49ca9af0aed38adcfd7aca081e3ef98/223_1014_5321_3193/500.jpg"
                },
                "tags": [
                    {
                        "id": "profile/thomasina-miers",
                        "type": "contributor",
                        "webTitle": "Thomasina Miers",
                        "webUrl": "https://www.theguardian.com/profile/thomasina-miers",
                        "apiUrl": "https://content.guardianapis.com/profile/thomasina-miers",
                        "references": [],
                        "bio": "<p>Thomasina Miers is chef and food writer. She is a former MasterChef winner and founder of the Wahaca group of Mexican restaurants<br><br></p>",
                        "bylineImageUrl": "https://uploads.guim.co.uk/2018/11/02/Thomasina-Miers.jpg",
                        "bylineLargeImageUrl": "https://uploads.guim.co.uk/2018/11/02/Thomasina_Miers,_L.png",
                        "firstName": "Thomasina",
                        "lastName": "Miers",
                        "twitterHandle": "thomasinamiers"
                    }
                ],
                "isHosted": false,
                "pillarId": "pillar/lifestyle",
                "pillarName": "Lifestyle"
            }
        ]
    }
}
