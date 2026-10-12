package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f47220b;
    public final i f47221c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f47220b = taskCompletionSource;
        this.f47221c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f47251a, null, this.f47220b);
    }

    @Override
    public final void zze() {
        this.f47221c.K0();
    }
}
