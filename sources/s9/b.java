package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.er0;
import u4.g;
import w9.o;
import w9.w;
public final class b implements Callable {
    public final boolean f45963a;
    public final o f45964b;
    public final da.b f45965c;

    public b(boolean z10, o oVar, da.b bVar) {
        this.f45963a = z10;
        this.f45964b = oVar;
        this.f45965c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f45963a) {
            o oVar = this.f45964b;
            ExecutorService executorService = oVar.f48428k;
            g gVar = new g(3, oVar, this.f45965c);
            ExecutorService executorService2 = w.f48460a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new er0(gVar, executorService, taskCompletionSource, 29));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
