package pd;

import java.util.concurrent.CancellationException;
import la.t;
public final class a extends CancellationException {
    public final transient t f44353a;

    public a(t tVar) {
        super("Flow was aborted, no more elements needed");
        this.f44353a = tVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
