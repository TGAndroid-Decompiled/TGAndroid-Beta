package t9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.ay0;
import u4.f;
import x9.o;
import x9.w;
public final class b implements Callable {
    public final boolean f46958a;
    public final o f46959b;
    public final ea.b f46960c;

    public b(boolean z10, o oVar, ea.b bVar) {
        this.f46958a = z10;
        this.f46959b = oVar;
        this.f46960c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f46958a) {
            o oVar = this.f46959b;
            ExecutorService executorService = oVar.f49759k;
            f fVar = new f(3, oVar, this.f46960c);
            ExecutorService executorService2 = w.f49787a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new ay0(fVar, executorService, taskCompletionSource, 29));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
