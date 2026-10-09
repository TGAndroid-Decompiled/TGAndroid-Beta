package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f53481a;
    public final xa.b f53482b;

    public a(ExecutorService executorService, xa.b bVar) {
        this.f53481a = executorService;
        this.f53482b = bVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f53481a.execute(runnable);
    }
}
