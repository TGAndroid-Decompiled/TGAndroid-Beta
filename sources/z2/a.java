package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import y2.h;
public final class a implements Executor {
    public final Executor f47191a;
    public final h f47192b;

    public a(ExecutorService executorService, h hVar) {
        this.f47191a = executorService;
        this.f47192b = hVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f47191a.execute(runnable);
    }
}
