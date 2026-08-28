package x5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.g5;
import java.util.concurrent.TimeUnit;
public final class t implements com.google.android.gms.common.api.o {
    public final g5 f48977a;
    public final TaskCompletionSource f48978b;
    public final k f48979c;

    public t(g5 g5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f48977a = g5Var;
        this.f48978b = taskCompletionSource;
        this.f48979c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            g5 g5Var = this.f48977a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) g5Var;
            l.j("Result has already been consumed.", !basePendingResult.f2764j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f2739n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f2738f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f48978b.setResult(this.f48979c.d(basePendingResult.j()));
            return;
        }
        this.f48978b.setException(l.m(status));
    }
}
