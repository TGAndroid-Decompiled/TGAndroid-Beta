package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.n;
public final class a implements Executor {
    public final Executor f50706a;
    public final n f50707b;

    public a(ExecutorService executorService, n nVar) {
        this.f50706a = executorService;
        this.f50707b = nVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f50706a.execute(runnable);
    }
}
