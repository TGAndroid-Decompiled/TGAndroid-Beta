package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.i5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f46342b;
    public final TaskCompletionSource f46343c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f46342b = bool;
        this.f46343c = taskCompletionSource;
    }

    @Override
    public final void I(Status status) {
        i5.a(status, this.f46342b, this.f46343c);
    }
}
