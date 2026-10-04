package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f45840b;
    public final i f45841c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f45840b = taskCompletionSource;
        this.f45841c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f45871a, null, this.f45840b);
    }

    @Override
    public final void zze() {
        this.f45841c.L0();
    }
}
