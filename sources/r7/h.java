package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.f5;
public final class h extends x {
    public final TaskCompletionSource f44939b;
    public final i f44940c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f44939b = taskCompletionSource;
        this.f44940c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        f5.a(vVar.f44970a, null, this.f44939b);
    }

    @Override
    public final void zze() {
        this.f44940c.L0();
    }
}
