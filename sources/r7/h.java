package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class h extends x {
    public final TaskCompletionSource f42388b;
    public final i f42389c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f42388b = taskCompletionSource;
        this.f42389c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        h5.a(vVar.f42414a, null, this.f42388b);
    }

    @Override
    public final void zze() {
        this.f42389c.L0();
    }
}
