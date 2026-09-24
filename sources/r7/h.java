package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class h extends x {
    public final TaskCompletionSource f42339b;
    public final i f42340c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f42339b = taskCompletionSource;
        this.f42340c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        h5.a(vVar.f42365a, null, this.f42339b);
    }

    @Override
    public final void zze() {
        this.f42340c.L0();
    }
}
