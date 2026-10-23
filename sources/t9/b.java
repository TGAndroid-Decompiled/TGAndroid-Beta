package t9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.cy0;
import u4.f;
import x9.o;
import x9.w;
public final class b implements Callable {
    public final boolean f46919a;
    public final o f46920b;
    public final ea.b f46921c;

    public b(boolean z10, o oVar, ea.b bVar) {
        this.f46919a = z10;
        this.f46920b = oVar;
        this.f46921c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f46919a) {
            o oVar = this.f46920b;
            ExecutorService executorService = oVar.f49722k;
            f fVar = new f(3, oVar, this.f46921c);
            ExecutorService executorService2 = w.f49750a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new cy0(fVar, executorService, taskCompletionSource, 29));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
