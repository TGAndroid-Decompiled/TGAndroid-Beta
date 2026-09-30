package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u2.o1;
public final class a implements Executor {
    public final Executor f48350a;
    public final o1 f48351b;

    public a(ExecutorService executorService, o1 o1Var) {
        this.f48350a = executorService;
        this.f48351b = o1Var;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f48350a.execute(runnable);
    }
}
