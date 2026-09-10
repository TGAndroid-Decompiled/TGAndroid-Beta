package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.sx0;
import u4.g;
import w9.o;
import w9.w;
public final class b implements Callable {
    public final boolean f41811a;
    public final o f41812b;
    public final da.b f41813c;

    public b(boolean z10, o oVar, da.b bVar) {
        this.f41811a = z10;
        this.f41812b = oVar;
        this.f41813c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f41811a) {
            o oVar = this.f41812b;
            ExecutorService executorService = oVar.f43918k;
            g gVar = new g(3, oVar, this.f41813c);
            ExecutorService executorService2 = w.f43946a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new sx0(gVar, executorService, taskCompletionSource, 22));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
