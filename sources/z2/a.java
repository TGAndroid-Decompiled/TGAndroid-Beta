package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import v3.d;
public final class a implements Executor {
    public final Executor f48021a;
    public final d f48022b;

    public a(ExecutorService executorService, d dVar) {
        this.f48021a = executorService;
        this.f48022b = dVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f48021a.execute(runnable);
    }
}
