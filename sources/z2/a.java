package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.m;
public final class a implements Executor {
    public final Executor f48374a;
    public final m f48375b;

    public a(ExecutorService executorService, m mVar) {
        this.f48374a = executorService;
        this.f48375b = mVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f48374a.execute(runnable);
    }
}
