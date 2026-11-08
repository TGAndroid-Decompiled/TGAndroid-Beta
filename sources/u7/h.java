package u7;

import a8.k8;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends v {
    public final TaskCompletionSource f56368b;
    public final i f56369c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f56368b = taskCompletionSource;
        this.f56369c = iVar;
    }

    @Override
    public final void P0(t tVar) {
        k8.a(tVar.f56389a, null, this.f56368b);
    }

    @Override
    public final void zze() {
        this.f56369c.m1();
    }
}
