package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.f5;
public final class h extends x {
    public final TaskCompletionSource f44968b;
    public final i f44969c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f44968b = taskCompletionSource;
        this.f44969c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        f5.a(vVar.f44999a, null, this.f44968b);
    }

    @Override
    public final void zze() {
        this.f44969c.L0();
    }
}
