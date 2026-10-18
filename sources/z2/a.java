package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f50672a;
    public final si.a f50673b;

    public a(ExecutorService executorService, si.a aVar) {
        this.f50672a = executorService;
        this.f50673b = aVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f50672a.execute(runnable);
    }
}
