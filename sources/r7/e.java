package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f46999b;
    public final TaskCompletionSource f47000c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f46999b = bool;
        this.f47000c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f46999b, this.f47000c);
    }
}
