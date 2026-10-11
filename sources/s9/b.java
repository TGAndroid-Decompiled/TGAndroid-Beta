package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import pi.h;
import u4.f;
import w9.o;
import w9.x;
public final class b implements Callable {
    public final boolean f47992a;
    public final o f47993b;
    public final da.c f47994c;

    public b(boolean z10, o oVar, da.c cVar) {
        this.f47992a = z10;
        this.f47993b = oVar;
        this.f47994c = cVar;
    }

    @Override
    public final Object call() {
        if (this.f47992a) {
            o oVar = this.f47993b;
            ExecutorService executorService = oVar.f50391k;
            f fVar = new f(3, oVar, this.f47994c);
            ExecutorService executorService2 = x.f50424a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new h(fVar, executorService, taskCompletionSource, 7));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
