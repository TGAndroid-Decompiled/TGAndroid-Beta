package u9;

import aa.b0;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.ny0;
import u4.f;
import y9.p;
import y9.x;
public final class b implements Callable {
    public final boolean f49622a;
    public final p f49623b;
    public final b0 f49624c;

    public b(boolean z10, p pVar, b0 b0Var) {
        this.f49622a = z10;
        this.f49623b = pVar;
        this.f49624c = b0Var;
    }

    @Override
    public final Object call() {
        if (this.f49622a) {
            p pVar = this.f49623b;
            ExecutorService executorService = pVar.f52462k;
            f fVar = new f(3, pVar, this.f49624c);
            ExecutorService executorService2 = x.f52490a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new ny0(fVar, executorService, taskCompletionSource, 29));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
