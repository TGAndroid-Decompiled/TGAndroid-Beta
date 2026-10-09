package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f53483a;
    public final xa.b f53484b;

    public a(ExecutorService executorService, xa.b bVar) {
        this.f53483a = executorService;
        this.f53484b = bVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f53483a.execute(runnable);
    }
}
