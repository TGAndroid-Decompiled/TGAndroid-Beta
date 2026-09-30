package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import tg.r;
import u4.g;
import w9.o;
import w9.w;
public final class b implements Callable {
    public final boolean f43166a;
    public final o f43167b;
    public final da.b f43168c;

    public b(boolean z10, o oVar, da.b bVar) {
        this.f43166a = z10;
        this.f43167b = oVar;
        this.f43168c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f43166a) {
            o oVar = this.f43167b;
            ExecutorService executorService = oVar.f45242k;
            g gVar = new g(3, oVar, this.f43168c);
            ExecutorService executorService2 = w.f45270a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new r(gVar, executorService, taskCompletionSource, 3));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
