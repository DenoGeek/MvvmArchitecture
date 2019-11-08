package ke.co.neverest.neverestarchitectureone.models;

import com.google.gson.annotations.SerializedName;

public class Job {
    private String id;

    private String title;

    private String location;

    private String user;

    private String startTime;

    private String endTime;

    private String status;

    private Double payment;

    private String description;

    public Job() {
    }

    private Job(Builder builder) {
        setId(builder.id);
        setTitle(builder.title);
        setLocation(builder.location);
        setUser(builder.user);
        setStartTime(builder.startTime);
        setEndTime(builder.endTime);
        setStatus(builder.status);
        setPayment(builder.payment);
        setDescription(builder.description);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public static final class Builder {
        private String id;
        private String title;
        private String location;
        private String user;
        private String startTime;
        private String endTime;
        private String status;
        private Double payment;
        private String description;

        private Builder() {
        }

        public Builder withId(String val) {
            id = val;
            return this;
        }

        public Builder withTitle(String val) {
            title = val;
            return this;
        }

        public Builder withLocation(String val) {
            location = val;
            return this;
        }

        public Builder withUser(String val) {
            user = val;
            return this;
        }

        public Builder withStartTime(String val) {
            startTime = val;
            return this;
        }

        public Builder withEndTime(String val) {
            endTime = val;
            return this;
        }

        public Builder withStatus(String val) {
            status = val;
            return this;
        }

        public Builder withPayment(Double val) {
            payment = val;
            return this;
        }

        public Builder withDescription(String val) {
            description = val;
            return this;
        }

        public Job build() {
            return new Job(this);
        }
    }
}
