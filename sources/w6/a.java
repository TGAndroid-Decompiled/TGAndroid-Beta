package w6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.p5;
public final class a extends com.google.android.gms.common.api.internal.i {
    public final TaskCompletionSource f49436b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f49436b = taskCompletionSource;
    }

    @Override
    public final void z(Status status) {
        p5.a(status, null, this.f49436b);
    }
}
