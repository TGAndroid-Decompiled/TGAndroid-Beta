package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import pi.i;
import u4.f;
import w9.p;
import w9.y;
public final class b implements Callable {
    public final boolean f48107a;
    public final p f48108b;
    public final da.c f48109c;

    public b(boolean z10, p pVar, da.c cVar) {
        this.f48107a = z10;
        this.f48108b = pVar;
        this.f48109c = cVar;
    }

    @Override
    public final Object call() {
        if (this.f48107a) {
            p pVar = this.f48108b;
            ExecutorService executorService = pVar.f50506k;
            f fVar = new f(3, pVar, this.f48109c);
            ExecutorService executorService2 = y.f50539a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new i(fVar, executorService, taskCompletionSource, 10));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
