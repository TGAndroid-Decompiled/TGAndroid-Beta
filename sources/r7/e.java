package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f42348b;
    public final TaskCompletionSource f42349c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f42348b = bool;
        this.f42349c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f42348b, this.f42349c);
    }
}
