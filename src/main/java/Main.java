
import model.Data;
import model.RequestParams;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

//        MyGridLayout gl = new MyGridLayout();
//
//        gl.addComponents((f) -> {
//            for (int i = 0; i < 10; i++) {
//                f.add(new JButton(String.valueOf(f)));
//            }
//        });

        NewsApi api = new NewsApi("8c3401b3-3022-4849-8781-826bb87826d1");
        RequestParams.Builder requestBuilder = RequestParams.newBuilder();
        requestBuilder.setPage(10);
        requestBuilder.setQuery("hot-dog");
        requestBuilder.setPage(2);
        requestBuilder.setOrderBy(RequestParams.Order.relevance);
        requestBuilder.setShowFields("trailText", "thumbnail");
        requestBuilder.addShowTag("blog");
        requestBuilder.addShowField("starRating");
        api.getNewsList(requestBuilder.build(), new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Data data = response.body();
                    System.out.println(data.getResponse().getResults().toString());
                }
            }

            @Override
            public void onFailure(Call<Data> call, Throwable throwable) {

            }
        });

    }

}

interface Kek {
    void doSomething(JFrame kek);
}

class MyGridLayout {
    JFrame f;

    MyGridLayout() {
        f = new JFrame();


        f.setLayout(new GridLayout(3, 3));
        //setting grid layout of 3 rows and 3 columns
        f.setSize(300, 300);
        f.setVisible(true);
    }

    void addComponents(Kek asd) {
        asd.doSomething(f);
    }
}