package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import sg.y;
public final class a implements Executor {
    public final Executor f50631a;
    public final y f50632b;

    public a(ExecutorService executorService, y yVar) {
        this.f50631a = executorService;
        this.f50632b = yVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f50631a.execute(runnable);
    }
}
