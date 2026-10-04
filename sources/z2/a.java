package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u2.l0;
public final class a implements Executor {
    public final Executor f52349a;
    public final l0 f52350b;

    public a(ExecutorService executorService, l0 l0Var) {
        this.f52349a = executorService;
        this.f52350b = l0Var;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f52349a.execute(runnable);
    }
}
