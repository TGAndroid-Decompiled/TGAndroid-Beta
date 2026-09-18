package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f42090b;
    public final TaskCompletionSource f42091c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f42090b = bool;
        this.f42091c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f42090b, this.f42091c);
    }
}
