package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import tg.r;
import u4.g;
import w9.o;
import w9.w;
public final class c implements Callable {
    public final boolean f43134a;
    public final o f43135b;
    public final da.b f43136c;

    public c(boolean z10, o oVar, da.b bVar) {
        this.f43134a = z10;
        this.f43135b = oVar;
        this.f43136c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f43134a) {
            o oVar = this.f43135b;
            ExecutorService executorService = oVar.f45213k;
            g gVar = new g(3, oVar, this.f43136c);
            ExecutorService executorService2 = w.f45241a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new r(gVar, executorService, taskCompletionSource, 3));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
