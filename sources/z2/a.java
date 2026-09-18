package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.m;
public final class a implements Executor {
    public final Executor f48328a;
    public final m f48329b;

    public a(ExecutorService executorService, m mVar) {
        this.f48328a = executorService;
        this.f48329b = mVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f48328a.execute(runnable);
    }
}
