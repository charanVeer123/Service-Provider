package android.com.cleaner.apiResponses.monthlyJobScheduled;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MonthlyJobScheduled {

    @SerializedName("isSuccess")
    @Expose
    private Boolean isSuccess;

    @SerializedName("isError")
    @Expose
    private Boolean isError;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("Job_id")
    @Expose
    private Integer jobId;


    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsError() {
        return isError;
    }

    public void setIsError(Boolean isError) {
        this.isError = isError;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

}
