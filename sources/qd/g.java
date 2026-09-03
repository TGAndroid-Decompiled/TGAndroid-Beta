package qd;
public final class g extends RuntimeException {
    public final transient uc.h f44830a;

    public g(uc.h hVar) {
        this.f44830a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f44830a.toString();
    }
}
