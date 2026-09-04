package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.f5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f44934b;
    public final TaskCompletionSource f44935c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f44934b = bool;
        this.f44935c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        f5.a(status, this.f44934b, this.f44935c);
    }
}
