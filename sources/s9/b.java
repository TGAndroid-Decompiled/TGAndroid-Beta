package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import tg.q;
import u4.f;
import w9.o;
import w9.w;
public final class b implements Callable {
    public final boolean f47912a;
    public final o f47913b;
    public final da.c f47914c;

    public b(boolean z10, o oVar, da.c cVar) {
        this.f47912a = z10;
        this.f47913b = oVar;
        this.f47914c = cVar;
    }

    @Override
    public final Object call() {
        if (this.f47912a) {
            o oVar = this.f47913b;
            ExecutorService executorService = oVar.f50314k;
            f fVar = new f(3, oVar, this.f47914c);
            ExecutorService executorService2 = w.f50346a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new q(fVar, executorService, taskCompletionSource, 6));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
