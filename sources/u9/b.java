package u9;

import aa.b0;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.oy0;
import u4.f;
import y9.p;
import y9.x;
public final class b implements Callable {
    public final boolean f49660a;
    public final p f49661b;
    public final b0 f49662c;

    public b(boolean z10, p pVar, b0 b0Var) {
        this.f49660a = z10;
        this.f49661b = pVar;
        this.f49662c = b0Var;
    }

    @Override
    public final Object call() {
        if (this.f49660a) {
            p pVar = this.f49661b;
            ExecutorService executorService = pVar.f52523k;
            f fVar = new f(3, pVar, this.f49662c);
            ExecutorService executorService2 = x.f52551a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new oy0(fVar, executorService, taskCompletionSource, 29));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
