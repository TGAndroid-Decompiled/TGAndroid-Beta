package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.er0;
import u4.g;
import w9.o;
import w9.w;
public final class b implements Callable {
    public final boolean f45990a;
    public final o f45991b;
    public final da.b f45992c;

    public b(boolean z10, o oVar, da.b bVar) {
        this.f45990a = z10;
        this.f45991b = oVar;
        this.f45992c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f45990a) {
            o oVar = this.f45991b;
            ExecutorService executorService = oVar.f48456k;
            g gVar = new g(3, oVar, this.f45992c);
            ExecutorService executorService2 = w.f48488a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new er0(gVar, executorService, taskCompletionSource, 29));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
