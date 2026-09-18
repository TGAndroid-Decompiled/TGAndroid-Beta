package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.m;
public final class a implements Executor {
    public final Executor f48103a;
    public final m f48104b;

    public a(ExecutorService executorService, m mVar) {
        this.f48103a = executorService;
        this.f48104b = mVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f48103a.execute(runnable);
    }
}
