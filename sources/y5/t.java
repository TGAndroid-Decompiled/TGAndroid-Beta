package y5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.f5;
import java.util.concurrent.TimeUnit;

public final class t implements com.google.android.gms.common.api.o {

    public final f5 f49694a;

    public final TaskCompletionSource f49695b;

    public final k f49696c;

    public t(f5 f5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f49694a = f5Var;
        this.f49695b = taskCompletionSource;
        this.f49696c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (!status.b()) {
            this.f49695b.setException(l.m(status));
            return;
        }
        f5 f5Var = this.f49694a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) f5Var;
        l.j("Result has already been consumed.", !basePendingResult.f3209j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.f3184n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f3183f);
        }
        l.j("Result is not ready.", basePendingResult.g());
        this.f49695b.setResult(this.f49696c.c(basePendingResult.j()));
    }
}
