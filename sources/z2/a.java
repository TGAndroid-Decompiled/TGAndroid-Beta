package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u2.x0;
public final class a implements Executor {
    public final Executor f48392a;
    public final x0 f48393b;

    public a(ExecutorService executorService, x0 x0Var) {
        this.f48392a = executorService;
        this.f48393b = x0Var;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f48392a.execute(runnable);
    }
}
