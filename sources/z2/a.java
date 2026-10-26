package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f52633a;
    public final vg.d f52634b;

    public a(ExecutorService executorService, vg.d dVar) {
        this.f52633a = executorService;
        this.f52634b = dVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f52633a.execute(runnable);
    }
}
