package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f47125b;
    public final TaskCompletionSource f47126c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f47125b = bool;
        this.f47126c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f47125b, this.f47126c);
    }
}
