package q6;

import a8.k8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
public final class v implements com.google.android.gms.common.api.o {
    public final k8 f56010a;
    public final TaskCompletionSource f56011b;
    public final l f56012c;

    public v(k8 k8Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f56010a = k8Var;
        this.f56011b = taskCompletionSource;
        this.f56012c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            k8 k8Var = this.f56010a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) k8Var;
            m.j("Result has already been consumed.", !basePendingResult.f6250j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6224n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6223f);
            }
            m.j("Result is not ready.", basePendingResult.g());
            this.f56011b.setResult(this.f56012c.o(basePendingResult.j()));
            return;
        }
        this.f56011b.setException(m.m(status));
    }
}
