package t9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.ay0;
import u4.f;
import x9.o;
import x9.w;
public final class b implements Callable {
    public final boolean f46936a;
    public final o f46937b;
    public final ea.b f46938c;

    public b(boolean z10, o oVar, ea.b bVar) {
        this.f46936a = z10;
        this.f46937b = oVar;
        this.f46938c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f46936a) {
            o oVar = this.f46937b;
            ExecutorService executorService = oVar.f49734k;
            f fVar = new f(3, oVar, this.f46938c);
            ExecutorService executorService2 = w.f49762a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new ay0(fVar, executorService, taskCompletionSource, 29));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
