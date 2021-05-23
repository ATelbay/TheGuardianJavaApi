import model.Data;
import model.RequestParams;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public class NewsApi {
    private static final String BASE_URL = "https://content.guardianapis.com/";
    private String accessToken;
    private Retrofit retrofit;
    private APIInterface api;

    public NewsApi(String accessToken) {
        this.accessToken = accessToken;

        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        api = retrofit.create(APIInterface.class);
    }

    public void getNewsList(
            RequestParams params,
            Callback<Data> callback
    ) {
        params.setApiKey(this.accessToken);

        api.getEverything(params.map()).enqueue(callback);
    }

    public interface APIInterface {
        @GET("search")
        Call<Data> getEverything(@QueryMap Map<String, String> params);
    }
}
