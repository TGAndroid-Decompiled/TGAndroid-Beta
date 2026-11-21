package u7;

import a8.l8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class e extends com.google.android.gms.common.api.internal.h {
    public final Object f58481b;
    public final TaskCompletionSource f58482c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f58481b = bool;
        this.f58482c = taskCompletionSource;
    }

    @Override
    public final void N(Status status) {
        l8.a(status, this.f58481b, this.f58482c);
    }
}
