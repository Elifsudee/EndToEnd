package pojos;

public class ElifResponsePojo {

    private ElifObjectPojo object;
    private String message;
    private String httpStatus;

    public ElifResponsePojo() {
    }

    public ElifResponsePojo(ElifObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }


    public ElifObjectPojo getObject() {
        return object;
    }

    public void setObject(ElifObjectPojo object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "ElifResponsePojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
