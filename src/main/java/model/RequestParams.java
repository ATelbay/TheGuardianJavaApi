package model;

import java.util.*;

public class RequestParams {
    private String q;
    private int pageSize = -1;
    private int page = -1;
    private String apiKey;
    private Order orderBy;
    private final List<String> showFields = new ArrayList<>(Arrays.asList("trailText", "thumbnail"));
    private final List<String> showTags = new ArrayList<>(Collections.singletonList("contributor"));

    public Order getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Order orderBy) {
        this.orderBy = orderBy;
    }

    public List<String> getShowFields() {
        return showFields;
    }

    public void setShowFields(String... showFields) {
        this.showFields.clear();
        this.showFields.addAll(Arrays.asList(showFields));
    }

    public void addShowFields(String showField) {
        this.showFields.add(showField);
    }

    private RequestParams() {
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public static Builder newBuilder() {
        return new RequestParams().new Builder();
    }

    public Map<String, String> map() {
        return new HashMap<String, String>() {{
            if (q != null)
                put("q", q);
            if (pageSize != -1)
                put("page-size", String.valueOf(pageSize));
            if (page != -1)
                put("page", String.valueOf(page));
            if (orderBy != null)
                put("order-by", orderBy.name());
            if (showFields.size() != 0)
                put("show-fields", split(showFields));
            if (showTags.size() != 0)
                put("show-tags", split(showTags));
            put("api-key", apiKey);
        }};
    }

    private String split(List<String> stringList) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < stringList.size(); i++) {
            if (i == stringList.size() - 1) {
                sBuilder.append(stringList.get(i));
            } else {
                sBuilder.append(stringList.get(i)).append(",");
            }
        }
        return sBuilder.toString();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setQuery(String q) {
            RequestParams.this.q = q;
            return this;
        }

        public Builder setPageSize(int pageSize) {
            RequestParams.this.pageSize = pageSize;
            return this;
        }

        public Builder setPage(int page) {
            RequestParams.this.page = page;
            return this;
        }

        public Builder setOrderBy(Order orderBy) {
            RequestParams.this.orderBy = orderBy;
            return this;
        }

        public Builder addShowField(String showField) {
            RequestParams.this.showFields.add(showField);
            return this;
        }

        public Builder setShowFields(String... showFields) {
            RequestParams.this.showFields.clear();
            RequestParams.this.showFields.addAll(Arrays.asList(showFields));
            return this;
        }

        public Builder addShowTag(String showField) {
            RequestParams.this.showTags.add(showField);
            return this;
        }

        public Builder setShowTags(String... showFields) {
            RequestParams.this.showTags.clear();
            RequestParams.this.showTags.addAll(Arrays.asList(showFields));
            return this;
        }

        public Builder setApiKey(String apiKey) {
            RequestParams.this.apiKey = apiKey;
            return this;
        }

        public RequestParams build() {
            return RequestParams.this;
        }
    }

    public enum Order {
        newest,
        oldest,
        relevance
    }
}