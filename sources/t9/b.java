package t9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.fy0;
import u4.f;
import x9.o;
import x9.w;
public final class b implements Callable {
    public final boolean f47354a;
    public final o f47355b;
    public final ea.b f47356c;

    public b(boolean z10, o oVar, ea.b bVar) {
        this.f47354a = z10;
        this.f47355b = oVar;
        this.f47356c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f47354a) {
            o oVar = this.f47355b;
            ExecutorService executorService = oVar.f50164k;
            f fVar = new f(3, oVar, this.f47356c);
            ExecutorService executorService2 = w.f50192a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new fy0(fVar, executorService, taskCompletionSource, 29));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
