package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import u4.g;
import w9.o;
import w9.v;
import w9.x;
public final class b implements Callable {
    public final boolean f42876a;
    public final o f42877b;
    public final da.b f42878c;

    public b(boolean z10, o oVar, da.b bVar) {
        this.f42876a = z10;
        this.f42877b = oVar;
        this.f42878c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f42876a) {
            o oVar = this.f42877b;
            ExecutorService executorService = oVar.f44959k;
            g gVar = new g(3, oVar, this.f42878c);
            ExecutorService executorService2 = x.f44990a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new v(gVar, executorService, taskCompletionSource, 0));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
