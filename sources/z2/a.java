package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f49242a;
    public final t0.a f49243b;

    public a(ExecutorService executorService, t0.a aVar) {
        this.f49242a = executorService;
        this.f49243b = aVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f49242a.execute(runnable);
    }
}
