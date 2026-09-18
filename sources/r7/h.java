package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f42095b;
    public final i f42096c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f42095b = taskCompletionSource;
        this.f42096c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f42121a, null, this.f42095b);
    }

    @Override
    public final void zze() {
        this.f42096c.L0();
    }
}
