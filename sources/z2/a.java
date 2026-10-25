package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f52630a;
    public final vg.d f52631b;

    public a(ExecutorService executorService, vg.d dVar) {
        this.f52630a = executorService;
        this.f52631b = dVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f52630a.execute(runnable);
    }
}
