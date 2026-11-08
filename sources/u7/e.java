package u7;

import a8.k8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class e extends com.google.android.gms.common.api.internal.h {
    public final Object f56364b;
    public final TaskCompletionSource f56365c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f56364b = bool;
        this.f56365c = taskCompletionSource;
    }

    @Override
    public final void N(Status status) {
        k8.a(status, this.f56364b, this.f56365c);
    }
}
