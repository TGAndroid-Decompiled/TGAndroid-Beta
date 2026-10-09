package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f47006b;
    public final i f47007c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f47006b = taskCompletionSource;
        this.f47007c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f47037a, null, this.f47006b);
    }

    @Override
    public final void zze() {
        this.f47007c.K0();
    }
}
