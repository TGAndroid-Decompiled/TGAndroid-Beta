package q6;

import a8.k8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
public final class v implements com.google.android.gms.common.api.o {
    public final k8 f56006a;
    public final TaskCompletionSource f56007b;
    public final l f56008c;

    public v(k8 k8Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f56006a = k8Var;
        this.f56007b = taskCompletionSource;
        this.f56008c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            k8 k8Var = this.f56006a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) k8Var;
            m.j("Result has already been consumed.", !basePendingResult.f6247j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6221n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6220f);
            }
            m.j("Result is not ready.", basePendingResult.g());
            this.f56007b.setResult(this.f56008c.o(basePendingResult.j()));
            return;
        }
        this.f56007b.setException(m.m(status));
    }
}
