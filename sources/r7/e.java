package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f47091b;
    public final TaskCompletionSource f47092c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f47091b = bool;
        this.f47092c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f47091b, this.f47092c);
    }
}
