package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f45854b;
    public final i f45855c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f45854b = taskCompletionSource;
        this.f45855c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f45885a, null, this.f45854b);
    }

    @Override
    public final void zze() {
        this.f45855c.L0();
    }
}
