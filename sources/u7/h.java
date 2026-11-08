package u7;

import a8.k8;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends v {
    public final TaskCompletionSource f56369b;
    public final i f56370c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f56369b = taskCompletionSource;
        this.f56370c = iVar;
    }

    @Override
    public final void P0(t tVar) {
        k8.a(tVar.f56390a, null, this.f56369b);
    }

    @Override
    public final void zze() {
        this.f56370c.m1();
    }
}
