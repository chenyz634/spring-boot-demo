package boot.application.exception;

/**
 * ResultException可自动转换成Result格式返回。
 *
 * @author chen
 */
public interface ResultException {

    Throwable getCause();

    String getMessage();

    default int getCode() {
        return 0;
    }

    default ResultException setCode(int code) {
        return this;
    }

    default Object getData() {
        return null;
    }

    default ResultException setData(Object data) {
        return this;
    }
}
