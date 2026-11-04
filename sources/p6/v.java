package p6;

import b8.x9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
public final class v implements com.google.android.gms.common.api.o {
    public final x9 f53319a;
    public final TaskCompletionSource f53320b;
    public final l f53321c;

    public v(x9 x9Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f53319a = x9Var;
        this.f53320b = taskCompletionSource;
        this.f53321c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            x9 x9Var = this.f53319a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) x9Var;
            m.i("Result has already been consumed.", !basePendingResult.f6605j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6579n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6578f);
            }
            m.i("Result is not ready.", basePendingResult.g());
            this.f53320b.setResult(this.f53321c.m(basePendingResult.j()));
            return;
        }
        this.f53320b.setException(m.l(status));
    }
}
