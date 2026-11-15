package u7;

import a8.l8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class e extends com.google.android.gms.common.api.internal.h {
    public final Object f57872b;
    public final TaskCompletionSource f57873c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f57872b = bool;
        this.f57873c = taskCompletionSource;
    }

    @Override
    public final void O(Status status) {
        l8.a(status, this.f57872b, this.f57873c);
    }
}
