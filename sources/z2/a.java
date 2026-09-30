package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u2.o1;
public final class a implements Executor {
    public final Executor f48456a;
    public final o1 f48457b;

    public a(ExecutorService executorService, o1 o1Var) {
        this.f48456a = executorService;
        this.f48457b = o1Var;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f48456a.execute(runnable);
    }
}
