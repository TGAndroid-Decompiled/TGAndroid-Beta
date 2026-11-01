package xd;

import bb.u;
import java.util.concurrent.CancellationException;
public final class a extends CancellationException {
    public final transient u f53676a;

    public a(u uVar) {
        super("Flow was aborted, no more elements needed");
        this.f53676a = uVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
