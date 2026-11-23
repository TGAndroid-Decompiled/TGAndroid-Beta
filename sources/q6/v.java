package q6;

import a8.l8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
public final class v implements com.google.android.gms.common.api.o {
    public final l8 f55975a;
    public final TaskCompletionSource f55976b;
    public final l f55977c;

    public v(l8 l8Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f55975a = l8Var;
        this.f55976b = taskCompletionSource;
        this.f55977c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            l8 l8Var = this.f55975a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) l8Var;
            m.j("Result has already been consumed.", !basePendingResult.f6213j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6187n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6186f);
            }
            m.j("Result is not ready.", basePendingResult.g());
            this.f55976b.setResult(this.f55977c.o(basePendingResult.j()));
            return;
        }
        this.f55976b.setException(m.m(status));
    }
}
