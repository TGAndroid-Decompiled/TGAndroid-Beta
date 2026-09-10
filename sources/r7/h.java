package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.f5;
public final class h extends x {
    public final TaskCompletionSource f41285b;
    public final i f41286c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f41285b = taskCompletionSource;
        this.f41286c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        f5.a(vVar.f41311a, null, this.f41285b);
    }

    @Override
    public final void zze() {
        this.f41286c.L0();
    }
}
