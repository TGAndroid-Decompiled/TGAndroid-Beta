package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f42323b;
    public final i f42324c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f42323b = taskCompletionSource;
        this.f42324c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f42349a, null, this.f42323b);
    }

    @Override
    public final void zze() {
        this.f42324c.L0();
    }
}
