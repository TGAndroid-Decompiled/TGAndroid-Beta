package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f45835b;
    public final TaskCompletionSource f45836c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f45835b = bool;
        this.f45836c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f45835b, this.f45836c);
    }
}
