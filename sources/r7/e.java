package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f45030b;
    public final TaskCompletionSource f45031c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f45030b = bool;
        this.f45031c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f45030b, this.f45031c);
    }
}
