package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import sg.y;
public final class a implements Executor {
    public final Executor f50626a;
    public final y f50627b;

    public a(ExecutorService executorService, y yVar) {
        this.f50626a = executorService;
        this.f50627b = yVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f50626a.execute(runnable);
    }
}
