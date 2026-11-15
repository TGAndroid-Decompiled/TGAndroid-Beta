package q6;

import a8.k8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
public final class v implements com.google.android.gms.common.api.o {
    public final k8 f55391a;
    public final TaskCompletionSource f55392b;
    public final l f55393c;

    public v(k8 k8Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f55391a = k8Var;
        this.f55392b = taskCompletionSource;
        this.f55393c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            k8 k8Var = this.f55391a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) k8Var;
            m.i("Result has already been consumed.", !basePendingResult.f5935j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f5909n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f5908f);
            }
            m.i("Result is not ready.", basePendingResult.g());
            this.f55392b.setResult(this.f55393c.q(basePendingResult.j()));
            return;
        }
        this.f55392b.setException(m.l(status));
    }
}
