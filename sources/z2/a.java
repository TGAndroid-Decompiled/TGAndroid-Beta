package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.n;
public final class a implements Executor {
    public final Executor f50705a;
    public final n f50706b;

    public a(ExecutorService executorService, n nVar) {
        this.f50705a = executorService;
        this.f50706b = nVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f50705a.execute(runnable);
    }
}
