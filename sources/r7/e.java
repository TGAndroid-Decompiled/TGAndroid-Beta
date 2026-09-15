package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f42063b;
    public final TaskCompletionSource f42064c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f42063b = bool;
        this.f42064c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f42063b, this.f42064c);
    }
}
