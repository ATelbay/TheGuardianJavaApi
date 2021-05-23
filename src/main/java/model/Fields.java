
package model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Fields {
    @Override
    public String toString() {
        return "Fields{" +
                "thumbnail='" + thumbnail + '\'' +
                ", trailText='" + trailText + '\'' +
                '}';
    }

    @Expose
    private String thumbnail;
    @Expose
    private String trailText;

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTrailText() {
        return trailText;
    }

    public void setTrailText(String trailText) {
        this.trailText = trailText;
    }

}
