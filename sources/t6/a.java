package t6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.g5;

public final class a extends com.google.android.gms.common.api.internal.i {

    public final TaskCompletionSource f48100b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f48100b = taskCompletionSource;
    }

    @Override
    public final void B(Status status) {
        g5.a(status, null, this.f48100b);
    }
}
