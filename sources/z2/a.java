package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import sg.y;
public final class a implements Executor {
    public final Executor f50634a;
    public final y f50635b;

    public a(ExecutorService executorService, y yVar) {
        this.f50634a = executorService;
        this.f50635b = yVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f50634a.execute(runnable);
    }
}
