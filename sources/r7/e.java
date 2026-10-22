package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f45043b;
    public final TaskCompletionSource f45044c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f45043b = bool;
        this.f45044c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f45043b, this.f45044c);
    }
}
