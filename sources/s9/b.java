package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import tg.r;
import u4.g;
import w9.o;
import w9.w;
public final class b implements Callable {
    public final boolean f43272a;
    public final o f43273b;
    public final da.b f43274c;

    public b(boolean z10, o oVar, da.b bVar) {
        this.f43272a = z10;
        this.f43273b = oVar;
        this.f43274c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f43272a) {
            o oVar = this.f43273b;
            ExecutorService executorService = oVar.f45348k;
            g gVar = new g(3, oVar, this.f43274c);
            ExecutorService executorService2 = w.f45376a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new r(gVar, executorService, taskCompletionSource, 3));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
