package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.m;
public final class a implements Executor {
    public final Executor f48067a;
    public final m f48068b;

    public a(ExecutorService executorService, m mVar) {
        this.f48067a = executorService;
        this.f48068b = mVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f48067a.execute(runnable);
    }
}
