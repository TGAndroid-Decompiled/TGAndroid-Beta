package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import tg.r;
import u4.g;
import w9.p;
import w9.x;
public final class b implements Callable {
    public final boolean f43209a;
    public final p f43210b;
    public final da.b f43211c;

    public b(boolean z10, p pVar, da.b bVar) {
        this.f43209a = z10;
        this.f43210b = pVar;
        this.f43211c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f43209a) {
            p pVar = this.f43210b;
            ExecutorService executorService = pVar.f45286k;
            g gVar = new g(3, pVar, this.f43211c);
            ExecutorService executorService2 = x.f45314a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new r(gVar, executorService, taskCompletionSource, 3));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
