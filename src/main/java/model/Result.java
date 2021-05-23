
package model;

import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Result {

    @Override
    public String toString() {
        return "Result{" +
                "apiUrl='" + apiUrl + '\'' +
                ", fields=" + fields +
                ", id='" + id + '\'' +
                ", isHosted=" + isHosted +
                ", pillarId='" + pillarId + '\'' +
                ", pillarName='" + pillarName + '\'' +
                ", sectionId='" + sectionId + '\'' +
                ", sectionName='" + sectionName + '\'' +
//                ", tags=" + tags +
                ", type='" + type + '\'' +
                ", webPublicationDate='" + webPublicationDate + '\'' +
                ", webTitle='" + webTitle + '\'' +
                ", webUrl='" + webUrl + '\'' +
                '}';
    }

    @Expose
    private String apiUrl;
    @Expose
    private Fields fields;
    @Expose
    private String id;
    @Expose
    private Boolean isHosted;
    @Expose
    private String pillarId;
    @Expose
    private String pillarName;
    @Expose
    private String sectionId;
    @Expose
    private String sectionName;
    //    @Expose
//    private List<Object> tags;
    @Expose
    private String type;
    @Expose
    private String webPublicationDate;
    @Expose
    private String webTitle;
    @Expose
    private String webUrl;

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsHosted() {
        return isHosted;
    }

    public void setIsHosted(Boolean isHosted) {
        this.isHosted = isHosted;
    }

    public String getPillarId() {
        return pillarId;
    }

    public void setPillarId(String pillarId) {
        this.pillarId = pillarId;
    }

    public String getPillarName() {
        return pillarName;
    }

    public void setPillarName(String pillarName) {
        this.pillarName = pillarName;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

//    public List<Object> getTags() {
//        return tags;
//    }
//
//    public void setTags(List<Object> tags) {
//        this.tags = tags;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public void setWebPublicationDate(String webPublicationDate) {
        this.webPublicationDate = webPublicationDate;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public void setWebTitle(String webTitle) {
        this.webTitle = webTitle;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

}
