package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import sg.y;
public final class a implements Executor {
    public final Executor f50635a;
    public final y f50636b;

    public a(ExecutorService executorService, y yVar) {
        this.f50635a = executorService;
        this.f50636b = yVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f50635a.execute(runnable);
    }
}
