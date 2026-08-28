package s6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;
public final class a extends com.google.android.gms.common.api.internal.i {
    public final TaskCompletionSource f47451b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f47451b = taskCompletionSource;
    }

    @Override
    public final void D(Status status) {
        h5.a(status, null, this.f47451b);
    }
}
