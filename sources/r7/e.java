package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f47223b;
    public final TaskCompletionSource f47224c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f47223b = bool;
        this.f47224c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f47223b, this.f47224c);
    }
}
