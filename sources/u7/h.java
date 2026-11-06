package u7;

import a8.k8;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends v {
    public final TaskCompletionSource f56280b;
    public final i f56281c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f56280b = taskCompletionSource;
        this.f56281c = iVar;
    }

    @Override
    public final void v0(t tVar) {
        k8.a(tVar.f56301a, null, this.f56280b);
    }

    @Override
    public final void zze() {
        this.f56281c.M0();
    }
}
