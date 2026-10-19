package t9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.by0;
import u4.f;
import x9.o;
import x9.w;
public final class b implements Callable {
    public final boolean f46910a;
    public final o f46911b;
    public final ea.b f46912c;

    public b(boolean z10, o oVar, ea.b bVar) {
        this.f46910a = z10;
        this.f46911b = oVar;
        this.f46912c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f46910a) {
            o oVar = this.f46911b;
            ExecutorService executorService = oVar.f49713k;
            f fVar = new f(3, oVar, this.f46912c);
            ExecutorService executorService2 = w.f49741a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new by0(fVar, executorService, taskCompletionSource, 29));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
