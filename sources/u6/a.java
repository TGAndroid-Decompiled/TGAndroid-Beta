package u6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.o5;
public final class a extends com.google.android.gms.common.api.internal.i {
    public final TaskCompletionSource f49115b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f49115b = taskCompletionSource;
    }

    @Override
    public final void B(Status status) {
        o5.a(status, null, this.f49115b);
    }
}
