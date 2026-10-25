package s7;

import a8.aa;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends x {
    public final TaskCompletionSource f47899b;
    public final i f47900c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f47899b = taskCompletionSource;
        this.f47900c = iVar;
    }

    @Override
    public final void v0(v vVar) {
        aa.a(vVar.f47925a, null, this.f47899b);
    }

    @Override
    public final void zze() {
        this.f47900c.K0();
    }
}
