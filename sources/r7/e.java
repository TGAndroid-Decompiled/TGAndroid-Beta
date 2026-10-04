package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f45842b;
    public final TaskCompletionSource f45843c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f45842b = bool;
        this.f45843c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f45842b, this.f45843c);
    }
}
