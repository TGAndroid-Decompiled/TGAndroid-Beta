package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import pi.h;
import u4.f;
import w9.o;
import w9.x;
public final class b implements Callable {
    public final boolean f47958a;
    public final o f47959b;
    public final da.c f47960c;

    public b(boolean z10, o oVar, da.c cVar) {
        this.f47958a = z10;
        this.f47959b = oVar;
        this.f47960c = cVar;
    }

    @Override
    public final Object call() {
        if (this.f47958a) {
            o oVar = this.f47959b;
            ExecutorService executorService = oVar.f50357k;
            f fVar = new f(3, oVar, this.f47960c);
            ExecutorService executorService2 = x.f50390a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new h(fVar, executorService, taskCompletionSource, 7));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
