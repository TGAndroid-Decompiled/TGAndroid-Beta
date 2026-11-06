package u7;

import a8.k8;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends v {
    public final TaskCompletionSource f56279b;
    public final i f56280c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f56279b = taskCompletionSource;
        this.f56280c = iVar;
    }

    @Override
    public final void v0(t tVar) {
        k8.a(tVar.f56300a, null, this.f56279b);
    }

    @Override
    public final void zze() {
        this.f56280c.M0();
    }
}
