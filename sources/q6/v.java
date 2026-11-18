package q6;

import a8.k8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
public final class v implements com.google.android.gms.common.api.o {
    public final k8 f55965a;
    public final TaskCompletionSource f55966b;
    public final l f55967c;

    public v(k8 k8Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f55965a = k8Var;
        this.f55966b = taskCompletionSource;
        this.f55967c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            k8 k8Var = this.f55965a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) k8Var;
            m.j("Result has already been consumed.", !basePendingResult.f6221j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6195n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6194f);
            }
            m.j("Result is not ready.", basePendingResult.g());
            this.f55966b.setResult(this.f55967c.o(basePendingResult.j()));
            return;
        }
        this.f55966b.setException(m.m(status));
    }
}
