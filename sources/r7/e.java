package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f42318b;
    public final TaskCompletionSource f42319c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f42318b = bool;
        this.f42319c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, this.f42318b, this.f42319c);
    }
}
