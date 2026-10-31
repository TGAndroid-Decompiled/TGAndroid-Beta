package t9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import rh.l5;
import x9.p;
import x9.x;
public final class b implements Callable {
    public final boolean f48569a;
    public final p f48570b;
    public final ea.d f48571c;

    public b(boolean z10, p pVar, ea.d dVar) {
        this.f48569a = z10;
        this.f48570b = pVar;
        this.f48571c = dVar;
    }

    @Override
    public final Object call() {
        if (this.f48569a) {
            p pVar = this.f48570b;
            ExecutorService executorService = pVar.f53491k;
            pb.d dVar = new pb.d(4, pVar, this.f48571c);
            ExecutorService executorService2 = x.f53519a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new l5(dVar, executorService, taskCompletionSource, 20));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
