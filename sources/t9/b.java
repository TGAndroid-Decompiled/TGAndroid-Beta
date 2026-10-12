package t9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.webrtc.i;
import u4.f;
import x9.p;
import x9.x;
public final class b implements Callable {
    public final boolean f45547a;
    public final p f45548b;
    public final ea.b f45549c;

    public b(boolean z10, p pVar, ea.b bVar) {
        this.f45547a = z10;
        this.f45548b = pVar;
        this.f45549c = bVar;
    }

    @Override
    public final Object call() {
        if (this.f45547a) {
            p pVar = this.f45548b;
            ExecutorService executorService = pVar.f48328k;
            f fVar = new f(3, pVar, this.f45549c);
            ExecutorService executorService2 = x.f48356a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new i(fVar, executorService, taskCompletionSource, 14));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
