package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f45058b;
    public final TaskCompletionSource f45059c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f45058b = bool;
        this.f45059c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f45058b, this.f45059c);
    }
}
