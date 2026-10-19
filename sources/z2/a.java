package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import sg.y;
public final class a implements Executor {
    public final Executor f50624a;
    public final y f50625b;

    public a(ExecutorService executorService, y yVar) {
        this.f50624a = executorService;
        this.f50625b = yVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f50624a.execute(runnable);
    }
}
