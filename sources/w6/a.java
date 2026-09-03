package w6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.r5;
public final class a extends com.google.android.gms.common.api.internal.i {
    public final TaskCompletionSource f46544b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f46544b = taskCompletionSource;
    }

    @Override
    public final void z(Status status) {
        r5.a(status, null, this.f46544b);
    }
}
