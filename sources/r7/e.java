package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.f5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f44963b;
    public final TaskCompletionSource f44964c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f44963b = bool;
        this.f44964c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        f5.a(status, this.f44963b, this.f44964c);
    }
}
