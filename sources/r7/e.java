package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f42347b;
    public final TaskCompletionSource f42348c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f42347b = bool;
        this.f42348c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f42347b, this.f42348c);
    }
}
