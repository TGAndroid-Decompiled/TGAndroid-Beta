package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f47045b;
    public final TaskCompletionSource f47046c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f47045b = bool;
        this.f47046c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f47045b, this.f47046c);
    }
}
