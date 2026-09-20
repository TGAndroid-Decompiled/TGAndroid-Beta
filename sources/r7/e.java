package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f42362b;
    public final TaskCompletionSource f42363c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f42362b = bool;
        this.f42363c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f42362b, this.f42363c);
    }
}
