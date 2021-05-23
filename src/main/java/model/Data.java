
package model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;


@Generated("net.hexar.json2pojo")
public class Data {

    @Expose
    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Data{" +
                "response=" + response +
                '}';
    }
}
