package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f42085b;
    public final TaskCompletionSource f42086c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f42085b = bool;
        this.f42086c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f42085b, this.f42086c);
    }
}
