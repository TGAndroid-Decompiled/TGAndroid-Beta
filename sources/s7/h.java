package s7;

import a8.aa;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends x {
    public final TaskCompletionSource f47902b;
    public final i f47903c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f47902b = taskCompletionSource;
        this.f47903c = iVar;
    }

    @Override
    public final void v0(v vVar) {
        aa.a(vVar.f47928a, null, this.f47902b);
    }

    @Override
    public final void zze() {
        this.f47903c.K0();
    }
}
