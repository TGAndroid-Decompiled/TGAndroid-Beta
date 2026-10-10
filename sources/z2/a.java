package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f53527a;
    public final xa.b f53528b;

    public a(ExecutorService executorService, xa.b bVar) {
        this.f53527a = executorService;
        this.f53528b = bVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f53527a.execute(runnable);
    }
}
