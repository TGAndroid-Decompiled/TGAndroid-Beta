package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import tg.q;
import u4.g;
import w9.p;
import w9.x;
public final class b implements Callable {
    public final boolean f46755a;
    public final p f46756b;
    public final da.b f46757c;

    public b(boolean z10, p pVar, da.b bVar) {
        this.f46755a = z10;
        this.f46756b = pVar;
        this.f46757c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f46755a) {
            p pVar = this.f46756b;
            ExecutorService executorService = pVar.f48982k;
            g gVar = new g(3, pVar, this.f46757c);
            ExecutorService executorService2 = x.f49014a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new q(gVar, executorService, taskCompletionSource, 4));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
