package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import w9.v;
public final class a implements Executor {
    public final Executor f53570a;
    public final v f53571b;

    public a(ExecutorService executorService, v vVar) {
        this.f53570a = executorService;
        this.f53571b = vVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f53570a.execute(runnable);
    }
}
