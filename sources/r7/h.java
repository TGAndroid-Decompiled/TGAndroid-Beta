package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f45839b;
    public final i f45840c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f45839b = taskCompletionSource;
        this.f45840c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f45870a, null, this.f45839b);
    }

    @Override
    public final void zze() {
        this.f45840c.L0();
    }
}
