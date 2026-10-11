package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import w9.v;
public final class a implements Executor {
    public final Executor f53604a;
    public final v f53605b;

    public a(ExecutorService executorService, v vVar) {
        this.f53604a = executorService;
        this.f53605b = vVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f53604a.execute(runnable);
    }
}
