package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import u4.g;
import w9.o;
import w9.v;
import w9.x;
public final class b implements Callable {
    public final boolean f42828a;
    public final o f42829b;
    public final da.b f42830c;

    public b(boolean z10, o oVar, da.b bVar) {
        this.f42828a = z10;
        this.f42829b = oVar;
        this.f42830c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f42828a) {
            o oVar = this.f42829b;
            ExecutorService executorService = oVar.f44909k;
            g gVar = new g(3, oVar, this.f42830c);
            ExecutorService executorService2 = x.f44940a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new v(gVar, executorService, taskCompletionSource, 0));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
