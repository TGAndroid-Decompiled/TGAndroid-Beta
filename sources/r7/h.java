package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.i5;
public final class h extends v {
    public final TaskCompletionSource f46358b;
    public final i f46359c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f46358b = taskCompletionSource;
        this.f46359c = iVar;
    }

    @Override
    public final void r0(t tVar) {
        i5.a(tVar.f46376a, null, this.f46358b);
    }

    @Override
    public final void zze() {
        this.f46359c.M0();
    }
}
