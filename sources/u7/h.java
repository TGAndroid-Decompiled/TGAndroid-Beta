package u7;

import a8.l8;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends v {
    public final TaskCompletionSource f58490b;
    public final i f58491c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f58490b = taskCompletionSource;
        this.f58491c = iVar;
    }

    @Override
    public final void P0(t tVar) {
        l8.a(tVar.f58511a, null, this.f58490b);
    }

    @Override
    public final void zze() {
        this.f58491c.m1();
    }
}
