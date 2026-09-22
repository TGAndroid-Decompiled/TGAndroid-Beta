package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f42064b;
    public final i f42065c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f42064b = taskCompletionSource;
        this.f42065c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f42090a, null, this.f42064b);
    }

    @Override
    public final void zze() {
        this.f42065c.L0();
    }
}
