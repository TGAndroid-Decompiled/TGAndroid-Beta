package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import v0.k;
public final class a implements Executor {
    public final Executor f51093a;
    public final k f51094b;

    public a(ExecutorService executorService, k kVar) {
        this.f51093a = executorService;
        this.f51094b = kVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f51093a.execute(runnable);
    }
}
