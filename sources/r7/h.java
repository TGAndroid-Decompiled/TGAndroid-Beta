package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f42090b;
    public final i f42091c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f42090b = taskCompletionSource;
        this.f42091c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f42116a, null, this.f42090b);
    }

    @Override
    public final void zze() {
        this.f42091c.L0();
    }
}
