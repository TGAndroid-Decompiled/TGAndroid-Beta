package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class h extends x {
    public final TaskCompletionSource f42355b;
    public final i f42356c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f42355b = taskCompletionSource;
        this.f42356c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        h5.a(vVar.f42381a, null, this.f42355b);
    }

    @Override
    public final void zze() {
        this.f42356c.L0();
    }
}
