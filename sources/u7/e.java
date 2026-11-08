package u7;

import a8.k8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class e extends com.google.android.gms.common.api.internal.h {
    public final Object f56363b;
    public final TaskCompletionSource f56364c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f56363b = bool;
        this.f56364c = taskCompletionSource;
    }

    @Override
    public final void N(Status status) {
        k8.a(status, this.f56363b, this.f56364c);
    }
}
