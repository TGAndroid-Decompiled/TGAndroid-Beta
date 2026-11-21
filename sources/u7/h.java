package u7;

import a8.l8;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends v {
    public final TaskCompletionSource f58486b;
    public final i f58487c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f58486b = taskCompletionSource;
        this.f58487c = iVar;
    }

    @Override
    public final void P0(t tVar) {
        l8.a(tVar.f58507a, null, this.f58486b);
    }

    @Override
    public final void zze() {
        this.f58487c.m1();
    }
}
