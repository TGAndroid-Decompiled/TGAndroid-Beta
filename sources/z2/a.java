package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.n;
public final class a implements Executor {
    public final Executor f50676a;
    public final n f50677b;

    public a(ExecutorService executorService, n nVar) {
        this.f50676a = executorService;
        this.f50677b = nVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f50676a.execute(runnable);
    }
}
