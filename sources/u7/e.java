package u7;

import a8.k8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class e extends com.google.android.gms.common.api.internal.h {
    public final Object f56274b;
    public final TaskCompletionSource f56275c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f56274b = bool;
        this.f56275c = taskCompletionSource;
    }

    @Override
    public final void E(Status status) {
        k8.a(status, this.f56274b, this.f56275c);
    }
}
