package u7;

import a8.k8;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends v {
    public final TaskCompletionSource f56255b;
    public final i f56256c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f56255b = taskCompletionSource;
        this.f56256c = iVar;
    }

    @Override
    public final void v0(t tVar) {
        k8.a(tVar.f56276a, null, this.f56255b);
    }

    @Override
    public final void zze() {
        this.f56256c.M0();
    }
}
