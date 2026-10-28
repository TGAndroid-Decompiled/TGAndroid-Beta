package s7;

import a8.aa;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f47932b;
    public final TaskCompletionSource f47933c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f47932b = bool;
        this.f47933c = taskCompletionSource;
    }

    @Override
    public final void F(Status status) {
        aa.a(status, this.f47932b, this.f47933c);
    }
}
