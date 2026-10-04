package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f45834b;
    public final TaskCompletionSource f45835c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f45834b = bool;
        this.f45835c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f45834b, this.f45835c);
    }
}
