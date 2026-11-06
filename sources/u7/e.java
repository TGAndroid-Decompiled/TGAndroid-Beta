package u7;

import a8.k8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class e extends com.google.android.gms.common.api.internal.h {
    public final Object f56250b;
    public final TaskCompletionSource f56251c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f56250b = bool;
        this.f56251c = taskCompletionSource;
    }

    @Override
    public final void E(Status status) {
        k8.a(status, this.f56250b, this.f56251c);
    }
}
