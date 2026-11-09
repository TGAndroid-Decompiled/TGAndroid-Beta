package u7;

import a8.k8;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends v {
    public final TaskCompletionSource f56381b;
    public final i f56382c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f56381b = taskCompletionSource;
        this.f56382c = iVar;
    }

    @Override
    public final void P0(t tVar) {
        k8.a(tVar.f56402a, null, this.f56381b);
    }

    @Override
    public final void zze() {
        this.f56382c.m1();
    }
}
