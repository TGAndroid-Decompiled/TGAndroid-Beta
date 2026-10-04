package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u2.l0;
public final class a implements Executor {
    public final Executor f52348a;
    public final l0 f52349b;

    public a(ExecutorService executorService, l0 l0Var) {
        this.f52348a = executorService;
        this.f52349b = l0Var;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f52348a.execute(runnable);
    }
}
