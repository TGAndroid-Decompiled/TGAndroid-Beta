package qd;
public final class g extends RuntimeException {
    public final transient uc.h f43023a;

    public g(uc.h hVar) {
        this.f43023a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f43023a.toString();
    }
}
