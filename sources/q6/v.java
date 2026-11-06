package q6;

import a8.j8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
public final class v implements com.google.android.gms.common.api.o {
    public final j8 f53825a;
    public final TaskCompletionSource f53826b;
    public final l f53827c;

    public v(j8 j8Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f53825a = j8Var;
        this.f53826b = taskCompletionSource;
        this.f53827c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            j8 j8Var = this.f53825a;
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
            this.f53826b.setResult(this.f53827c.b(basePendingResult.j()));
            return;
        }
        this.f53826b.setException(m.l(status));
    }
}
