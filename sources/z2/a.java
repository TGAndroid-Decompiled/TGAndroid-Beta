package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f52691a;
    public final vg.d f52692b;

    public a(ExecutorService executorService, vg.d dVar) {
        this.f52691a = executorService;
        this.f52692b = dVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f52691a.execute(runnable);
    }
}
