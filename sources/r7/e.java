package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f43943b;
    public final TaskCompletionSource f43944c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f43943b = bool;
        this.f43944c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f43943b, this.f43944c);
    }
}
