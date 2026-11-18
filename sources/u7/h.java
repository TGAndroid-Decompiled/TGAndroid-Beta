package u7;

import a8.l8;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends v {
    public final TaskCompletionSource f58445b;
    public final i f58446c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f58445b = taskCompletionSource;
        this.f58446c = iVar;
    }

    @Override
    public final void P0(t tVar) {
        l8.a(tVar.f58466a, null, this.f58445b);
    }

    @Override
    public final void zze() {
        this.f58446c.m1();
    }
}
