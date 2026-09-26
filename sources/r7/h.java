package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class h extends x {
    public final TaskCompletionSource f42352b;
    public final i f42353c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f42352b = taskCompletionSource;
        this.f42353c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        h5.a(vVar.f42378a, null, this.f42352b);
    }

    @Override
    public final void zze() {
        this.f42353c.L0();
    }
}
