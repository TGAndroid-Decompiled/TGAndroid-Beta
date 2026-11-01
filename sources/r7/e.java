package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.i5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f46353b;
    public final TaskCompletionSource f46354c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f46353b = bool;
        this.f46354c = taskCompletionSource;
    }

    @Override
    public final void I(Status status) {
        i5.a(status, this.f46353b, this.f46354c);
    }
}
