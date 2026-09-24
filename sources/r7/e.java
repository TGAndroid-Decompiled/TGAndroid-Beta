package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f42334b;
    public final TaskCompletionSource f42335c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f42334b = bool;
        this.f42335c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f42334b, this.f42335c);
    }
}
