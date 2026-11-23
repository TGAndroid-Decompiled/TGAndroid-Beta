package u7;

import a8.m8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class e extends com.google.android.gms.common.api.internal.h {
    public final Object f58450b;
    public final TaskCompletionSource f58451c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f58450b = bool;
        this.f58451c = taskCompletionSource;
    }

    @Override
    public final void N(Status status) {
        m8.a(status, this.f58450b, this.f58451c);
    }
}
