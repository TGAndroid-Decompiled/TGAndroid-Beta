package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f45040b;
    public final TaskCompletionSource f45041c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f45040b = bool;
        this.f45041c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f45040b, this.f45041c);
    }
}
