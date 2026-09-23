package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f42020b;
    public final i f42021c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f42020b = taskCompletionSource;
        this.f42021c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f42046a, null, this.f42020b);
    }

    @Override
    public final void zze() {
        this.f42021c.L0();
    }
}
