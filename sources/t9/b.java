package t9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.cy0;
import u4.f;
import x9.o;
import x9.w;
public final class b implements Callable {
    public final boolean f46915a;
    public final o f46916b;
    public final ea.b f46917c;

    public b(boolean z10, o oVar, ea.b bVar) {
        this.f46915a = z10;
        this.f46916b = oVar;
        this.f46917c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f46915a) {
            o oVar = this.f46916b;
            ExecutorService executorService = oVar.f49718k;
            f fVar = new f(3, oVar, this.f46917c);
            ExecutorService executorService2 = w.f49746a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new cy0(fVar, executorService, taskCompletionSource, 29));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
