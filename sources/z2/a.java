package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f49241a;
    public final t0.a f49242b;

    public a(ExecutorService executorService, t0.a aVar) {
        this.f49241a = executorService;
        this.f49242b = aVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f49241a.execute(runnable);
    }
}
