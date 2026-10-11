package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f47130b;
    public final i f47131c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f47130b = taskCompletionSource;
        this.f47131c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f47161a, null, this.f47130b);
    }

    @Override
    public final void zze() {
        this.f47131c.K0();
    }
}
