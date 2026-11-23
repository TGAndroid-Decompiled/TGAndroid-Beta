package u7;

import a8.m8;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends v {
    public final TaskCompletionSource f58455b;
    public final i f58456c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f58455b = taskCompletionSource;
        this.f58456c = iVar;
    }

    @Override
    public final void P0(t tVar) {
        m8.a(tVar.f58476a, null, this.f58455b);
    }

    @Override
    public final void zze() {
        this.f58456c.m1();
    }
}
