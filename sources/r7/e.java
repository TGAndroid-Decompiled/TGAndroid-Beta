package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f43702b;
    public final TaskCompletionSource f43703c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f43702b = bool;
        this.f43703c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f43702b, this.f43703c);
    }
}
