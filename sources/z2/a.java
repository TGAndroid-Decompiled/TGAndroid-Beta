package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f54561a;
    public final xg.a f54562b;

    public a(ExecutorService executorService, xg.a aVar) {
        this.f54561a = executorService;
        this.f54562b = aVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f54561a.execute(runnable);
    }
}
