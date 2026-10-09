package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f47001b;
    public final TaskCompletionSource f47002c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f47001b = bool;
        this.f47002c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f47001b, this.f47002c);
    }
}
