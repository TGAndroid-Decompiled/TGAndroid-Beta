package u7;

import a8.k8;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends v {
    public final TaskCompletionSource f56380b;
    public final i f56381c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f56380b = taskCompletionSource;
        this.f56381c = iVar;
    }

    @Override
    public final void P0(t tVar) {
        k8.a(tVar.f56401a, null, this.f56380b);
    }

    @Override
    public final void zze() {
        this.f56381c.m1();
    }
}
