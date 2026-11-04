package t7;

import b8.y9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class e extends com.google.android.gms.common.api.internal.h {
    public final Object f54954b;
    public final TaskCompletionSource f54955c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f54954b = bool;
        this.f54955c = taskCompletionSource;
    }

    @Override
    public final void G(Status status) {
        y9.a(status, this.f54954b, this.f54955c);
    }
}
