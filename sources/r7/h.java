package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.f5;
public final class h extends x {
    public final TaskCompletionSource f44940b;
    public final i f44941c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f44940b = taskCompletionSource;
        this.f44941c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        f5.a(vVar.f44971a, null, this.f44940b);
    }

    @Override
    public final void zze() {
        this.f44941c.L0();
    }
}
