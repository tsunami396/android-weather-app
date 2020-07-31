package com.example.android_weather_app.api;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * OpenWeatherMap API
 */
public class WeatherApi {

    /* ヘッダーパラメータ */
    private final String xRapidapiHostName = "x-rapidapi-host";
    private final String xRapidapiHostValue = "community-open-weather-map.p.rapidapi.com";

    private final String xRapidapiKeyName = "x-rapidapi-key";
    private final String xRapidapiKeyValue = "a14ca468e9mshaebfa844a910844p1454eejsn7e02e9932b12";

    /* 必須パラメータ */
    /* 都市を検索するときにこのパラメーターを使用します。
    他のパラメーターと一緒に使用しないでください */
    private final String q = "london";

    /* オプチョンのパラメータ */
    /* lonと一緒に使用する必要があります。
    都市の緯度がわかっている場合は、現在の気象データを取得します。 */
    private final String lat = "";
    /* latで使用する必要があります。
    あなたが街の経度を知っているときに現在の気象データを取得します。 */
    private final String lon = "";

    /* JavaScripコードを使用するには、コールバックfunctionNameをJSONPコールバックに転送します。 */
    private final String callback = "test";

    /* 都市IDがわかっている場合は、現在の気象データを取得します。
     lon、lat、またはqでは使用しないでください */
    private final int id = 2172797;

    /* langパラメータを使用して、言語で出力を取得できます。
    対応するlang値で使用できる次の言語をサポートしています：
    英語-en、ロシア語-ru、イタリア語-it、
    スペイン語-sp、ウクライナ語-ua、ドイツ語-de、
    ポルトガル語-pt、ルーマニア語-ro、ポーランド語-pl 、
    フィンランド語-fi、オランダ語-nl、フランス語-fr、
    ブルガリア語-bg、スウェーデン語-se、繁体字中国語-zhtw、
    簡体字中国語-zhcn、トルコ語-tr */
    private final String lang = "";

    /* 単位ごとに異なるタイプのメートル法を使用できます。
    "metric" or "imperial" */
    private final String units = "metric";

    /* 空白のままにすると、デフォルトでJSON出力になります。
    XMLまたはHTMLでデータを取得する機能。 */
    private final String mode = "";

    /* リクエストURL */
    private final String apiUrl = "https://community-open-weather-map.p.rapidapi.com/weather?";

    /**
     * constructor
     */
    public WeatherApi() {
    }

    private String createApiUrl() {
        String url = apiUrl +
                 "callback=" + callback +
                 "&id=" + id +
                 "&units=" + units +
                 "&q=" + q;
        return url;
    }

    public Response testApi() throws Exception {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(createApiUrl())
                .get()
                .addHeader(xRapidapiHostName, xRapidapiHostValue)
                .addHeader(xRapidapiKeyName, xRapidapiKeyValue)
                .build();

        Response response = client.newCall(request).execute();

        return response;
    }
}
