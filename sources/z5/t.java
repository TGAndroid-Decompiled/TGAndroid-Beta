package z5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.n5;
import java.util.concurrent.TimeUnit;
public final class t implements com.google.android.gms.common.api.o {
    public final n5 f50677a;
    public final TaskCompletionSource f50678b;
    public final k f50679c;

    public t(n5 n5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f50677a = n5Var;
        this.f50678b = taskCompletionSource;
        this.f50679c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            n5 n5Var = this.f50677a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) n5Var;
            l.j("Result has already been consumed.", !basePendingResult.f3778j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f3753n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f3752f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f50678b.setResult(this.f50679c.l(basePendingResult.j()));
            return;
        }
        this.f50678b.setException(l.m(status));
    }
}
