package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f42349b;
    public final TaskCompletionSource f42350c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f42349b = bool;
        this.f42350c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f42349b, this.f42350c);
    }
}
