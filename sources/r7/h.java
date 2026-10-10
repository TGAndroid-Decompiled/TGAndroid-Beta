package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f47050b;
    public final i f47051c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f47050b = taskCompletionSource;
        this.f47051c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f47081a, null, this.f47050b);
    }

    @Override
    public final void zze() {
        this.f47051c.K0();
    }
}
