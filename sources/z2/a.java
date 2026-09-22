package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.m;
public final class a implements Executor {
    public final Executor f48395a;
    public final m f48396b;

    public a(ExecutorService executorService, m mVar) {
        this.f48395a = executorService;
        this.f48396b = mVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f48395a.execute(runnable);
    }
}
