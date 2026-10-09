package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import tg.q;
import u4.f;
import w9.o;
import w9.w;
public final class b implements Callable {
    public final boolean f47868a;
    public final o f47869b;
    public final da.c f47870c;

    public b(boolean z10, o oVar, da.c cVar) {
        this.f47868a = z10;
        this.f47869b = oVar;
        this.f47870c = cVar;
    }

    @Override
    public final Object call() {
        if (this.f47868a) {
            o oVar = this.f47869b;
            ExecutorService executorService = oVar.f50270k;
            f fVar = new f(3, oVar, this.f47870c);
            ExecutorService executorService2 = w.f50302a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new q(fVar, executorService, taskCompletionSource, 5));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
