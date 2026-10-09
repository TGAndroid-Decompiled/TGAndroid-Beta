package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f47004b;
    public final i f47005c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f47004b = taskCompletionSource;
        this.f47005c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f47035a, null, this.f47004b);
    }

    @Override
    public final void zze() {
        this.f47005c.K0();
    }
}
