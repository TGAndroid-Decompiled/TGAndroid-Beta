package t9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.ey0;
import u4.f;
import x9.o;
import x9.w;
public final class b implements Callable {
    public final boolean f47353a;
    public final o f47354b;
    public final ea.b f47355c;

    public b(boolean z10, o oVar, ea.b bVar) {
        this.f47353a = z10;
        this.f47354b = oVar;
        this.f47355c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f47353a) {
            o oVar = this.f47354b;
            ExecutorService executorService = oVar.f50163k;
            f fVar = new f(3, oVar, this.f47355c);
            ExecutorService executorService2 = w.f50191a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new ey0(fVar, executorService, taskCompletionSource, 29));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
