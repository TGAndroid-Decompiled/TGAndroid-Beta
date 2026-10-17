package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f50647a;
    public final si.a f50648b;

    public a(ExecutorService executorService, si.a aVar) {
        this.f50647a = executorService;
        this.f50648b = aVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f50647a.execute(runnable);
    }
}
