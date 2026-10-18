package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import sg.y;
public final class a implements Executor {
    public final Executor f50625a;
    public final y f50626b;

    public a(ExecutorService executorService, y yVar) {
        this.f50625a = executorService;
        this.f50626b = yVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f50625a.execute(runnable);
    }
}
