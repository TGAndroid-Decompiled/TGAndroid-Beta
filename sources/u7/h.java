package u7;

import a8.m8;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends v {
    public final TaskCompletionSource f58570b;
    public final i f58571c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f58570b = taskCompletionSource;
        this.f58571c = iVar;
    }

    @Override
    public final void P0(t tVar) {
        m8.a(tVar.f58591a, null, this.f58570b);
    }

    @Override
    public final void zze() {
        this.f58571c.m1();
    }
}
