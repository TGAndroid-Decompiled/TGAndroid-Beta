package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f42015b;
    public final TaskCompletionSource f42016c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f42015b = bool;
        this.f42016c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f42015b, this.f42016c);
    }
}
