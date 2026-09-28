package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class h extends x {
    public final TaskCompletionSource f42354b;
    public final i f42355c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f42354b = taskCompletionSource;
        this.f42355c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        h5.a(vVar.f42380a, null, this.f42354b);
    }

    @Override
    public final void zze() {
        this.f42355c.L0();
    }
}
