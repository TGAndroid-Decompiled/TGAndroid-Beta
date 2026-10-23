package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import v0.k;
public final class a implements Executor {
    public final Executor f51094a;
    public final k f51095b;

    public a(ExecutorService executorService, k kVar) {
        this.f51094a = executorService;
        this.f51095b = kVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f51094a.execute(runnable);
    }
}
