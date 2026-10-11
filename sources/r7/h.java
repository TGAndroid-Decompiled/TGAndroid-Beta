package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f47096b;
    public final i f47097c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f47096b = taskCompletionSource;
        this.f47097c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f47127a, null, this.f47096b);
    }

    @Override
    public final void zze() {
        this.f47097c.K0();
    }
}
