package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.m;
public final class a implements Executor {
    public final Executor f48098a;
    public final m f48099b;

    public a(ExecutorService executorService, m mVar) {
        this.f48098a = executorService;
        this.f48099b = mVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f48098a.execute(runnable);
    }
}
