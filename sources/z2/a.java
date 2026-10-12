package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import w9.w;
public final class a implements Executor {
    public final Executor f53707a;
    public final w f53708b;

    public a(ExecutorService executorService, w wVar) {
        this.f53707a = executorService;
        this.f53708b = wVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f53707a.execute(runnable);
    }
}
