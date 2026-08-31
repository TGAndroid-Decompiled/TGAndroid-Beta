package qd;
public final class g extends RuntimeException {
    public final transient uc.h f44799a;

    public g(uc.h hVar) {
        this.f44799a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f44799a.toString();
    }
}
