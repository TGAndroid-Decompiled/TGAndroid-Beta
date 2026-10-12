package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import w9.w;
public final class a implements Executor {
    public final Executor f53715a;
    public final w f53716b;

    public a(ExecutorService executorService, w wVar) {
        this.f53715a = executorService;
        this.f53716b = wVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f53715a.execute(runnable);
    }
}
