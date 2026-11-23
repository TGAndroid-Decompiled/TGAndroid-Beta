package q6;

import a8.l8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
public final class v implements com.google.android.gms.common.api.o {
    public final l8 f56088a;
    public final TaskCompletionSource f56089b;
    public final l f56090c;

    public v(l8 l8Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f56088a = l8Var;
        this.f56089b = taskCompletionSource;
        this.f56090c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            l8 l8Var = this.f56088a;
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
            this.f56089b.setResult(this.f56090c.n(basePendingResult.j()));
            return;
        }
        this.f56089b.setException(m.m(status));
    }
}
