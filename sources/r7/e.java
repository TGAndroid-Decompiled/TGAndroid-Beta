package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f45456b;
    public final TaskCompletionSource f45457c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f45456b = bool;
        this.f45457c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f45456b, this.f45457c);
    }
}
