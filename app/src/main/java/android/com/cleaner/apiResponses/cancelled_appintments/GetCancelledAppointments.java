package android.com.cleaner.apiResponses.cancelled_appintments;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetCancelledAppointments{
    @SerializedName("isSuccess")
    @Expose
    private Boolean isSuccess;
    @SerializedName("isError")
    @Expose
    private Boolean isError;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("payload")
    @Expose
    private List<EOCancelledPayload> payload = null;

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

    public List<EOCancelledPayload> getPayload() {
        return payload;
    }

    public void setPayload(List<EOCancelledPayload> payload) {
        this.payload = payload;
    }

}