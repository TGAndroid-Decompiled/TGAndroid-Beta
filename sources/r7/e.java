package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.f5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f41280b;
    public final TaskCompletionSource f41281c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f41280b = bool;
        this.f41281c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        f5.a(status, this.f41280b, this.f41281c);
    }
}
