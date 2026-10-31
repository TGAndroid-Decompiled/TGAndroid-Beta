package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.i5;
public final class h extends v {
    public final TaskCompletionSource f46347b;
    public final i f46348c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f46347b = taskCompletionSource;
        this.f46348c = iVar;
    }

    @Override
    public final void r0(t tVar) {
        i5.a(tVar.f46365a, null, this.f46347b);
    }

    @Override
    public final void zze() {
        this.f46348c.M0();
    }
}
