package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f45078b;
    public final TaskCompletionSource f45079c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f45078b = bool;
        this.f45079c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f45078b, this.f45079c);
    }
}
