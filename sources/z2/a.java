package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.m;
public final class a implements Executor {
    public final Executor f48075a;
    public final m f48076b;

    public a(ExecutorService executorService, m mVar) {
        this.f48075a = executorService;
        this.f48076b = mVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f48075a.execute(runnable);
    }
}
