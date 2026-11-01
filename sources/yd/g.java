package yd;
public final class g extends RuntimeException {
    public final transient cd.h f54422a;

    public g(cd.h hVar) {
        this.f54422a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f54422a.toString();
    }
}
