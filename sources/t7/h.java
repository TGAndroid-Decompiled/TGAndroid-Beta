package t7;

import b8.y9;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends v {
    public final TaskCompletionSource f54959b;
    public final i f54960c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f54959b = taskCompletionSource;
        this.f54960c = iVar;
    }

    @Override
    public final void X(t tVar) {
        y9.a(tVar.f54980a, null, this.f54959b);
    }

    @Override
    public final void zze() {
        this.f54960c.M0();
    }
}
