package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.er0;
import u4.g;
import w9.o;
import w9.w;
public final class b implements Callable {
    public final boolean f45962a;
    public final o f45963b;
    public final da.b f45964c;

    public b(boolean z10, o oVar, da.b bVar) {
        this.f45962a = z10;
        this.f45963b = oVar;
        this.f45964c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f45962a) {
            o oVar = this.f45963b;
            ExecutorService executorService = oVar.f48427k;
            g gVar = new g(3, oVar, this.f45964c);
            ExecutorService executorService2 = w.f48459a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new er0(gVar, executorService, taskCompletionSource, 29));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
