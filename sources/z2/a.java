package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u2.l0;
public final class a implements Executor {
    public final Executor f52377a;
    public final l0 f52378b;

    public a(ExecutorService executorService, l0 l0Var) {
        this.f52377a = executorService;
        this.f52378b = l0Var;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f52377a.execute(runnable);
    }
}
