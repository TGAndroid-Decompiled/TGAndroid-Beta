package t9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.by0;
import u4.f;
import x9.o;
import x9.w;
public final class b implements Callable {
    public final boolean f46908a;
    public final o f46909b;
    public final ea.b f46910c;

    public b(boolean z10, o oVar, ea.b bVar) {
        this.f46908a = z10;
        this.f46909b = oVar;
        this.f46910c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f46908a) {
            o oVar = this.f46909b;
            ExecutorService executorService = oVar.f49711k;
            f fVar = new f(3, oVar, this.f46910c);
            ExecutorService executorService2 = w.f49739a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new by0(fVar, executorService, taskCompletionSource, 29));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
