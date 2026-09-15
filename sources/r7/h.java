package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class h extends x {
    public final TaskCompletionSource f42068b;
    public final i f42069c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f42068b = taskCompletionSource;
        this.f42069c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        g5.a(vVar.f42094a, null, this.f42068b);
    }

    @Override
    public final void zze() {
        this.f42069c.L0();
    }
}
