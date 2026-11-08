package q6;

import a8.j8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
public final class v implements com.google.android.gms.common.api.o {
    public final j8 f53942a;
    public final TaskCompletionSource f53943b;
    public final l f53944c;

    public v(j8 j8Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f53942a = j8Var;
        this.f53943b = taskCompletionSource;
        this.f53944c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            j8 j8Var = this.f53942a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) j8Var;
            m.i("Result has already been consumed.", !basePendingResult.f6553j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6527n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6526f);
            }
            m.i("Result is not ready.", basePendingResult.g());
            this.f53943b.setResult(this.f53944c.b(basePendingResult.j()));
            return;
        }
        this.f53943b.setException(m.l(status));
    }
}
