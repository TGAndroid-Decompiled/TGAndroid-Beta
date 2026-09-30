package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f42453b;
    public final TaskCompletionSource f42454c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f42453b = bool;
        this.f42454c = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, this.f42453b, this.f42454c);
    }
}
