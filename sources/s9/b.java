package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import pi.h;
import u4.f;
import w9.p;
import w9.y;
public final class b implements Callable {
    public final boolean f48099a;
    public final p f48100b;
    public final da.c f48101c;

    public b(boolean z10, p pVar, da.c cVar) {
        this.f48099a = z10;
        this.f48100b = pVar;
        this.f48101c = cVar;
    }

    @Override
    public final Object call() {
        if (this.f48099a) {
            p pVar = this.f48100b;
            ExecutorService executorService = pVar.f50498k;
            f fVar = new f(3, pVar, this.f48101c);
            ExecutorService executorService2 = y.f50531a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new h(fVar, executorService, taskCompletionSource, 11));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
