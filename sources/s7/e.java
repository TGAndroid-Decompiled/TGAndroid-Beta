package s7;

import a8.aa;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f47897b;
    public final TaskCompletionSource f47898c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f47897b = bool;
        this.f47898c = taskCompletionSource;
    }

    @Override
    public final void F(Status status) {
        aa.a(status, this.f47897b, this.f47898c);
    }
}
