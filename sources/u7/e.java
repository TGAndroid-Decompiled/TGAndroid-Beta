package u7;

import a8.k8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class e extends com.google.android.gms.common.api.internal.h {
    public final Object f56375b;
    public final TaskCompletionSource f56376c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f56375b = bool;
        this.f56376c = taskCompletionSource;
    }

    @Override
    public final void N(Status status) {
        k8.a(status, this.f56375b, this.f56376c);
    }
}
