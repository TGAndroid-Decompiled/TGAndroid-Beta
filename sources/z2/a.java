package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f54543a;
    public final xg.a f54544b;

    public a(ExecutorService executorService, xg.a aVar) {
        this.f54543a = executorService;
        this.f54544b = aVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f54543a.execute(runnable);
    }
}
