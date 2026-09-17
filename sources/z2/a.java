package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.n;
public final class a implements Executor {
    public final Executor f50677a;
    public final n f50678b;

    public a(ExecutorService executorService, n nVar) {
        this.f50677a = executorService;
        this.f50678b = nVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f50677a.execute(runnable);
    }
}
