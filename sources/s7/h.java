package s7;

import a8.aa;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends x {
    public final TaskCompletionSource f47937b;
    public final i f47938c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f47937b = taskCompletionSource;
        this.f47938c = iVar;
    }

    @Override
    public final void v0(v vVar) {
        aa.a(vVar.f47963a, null, this.f47937b);
    }

    @Override
    public final void zze() {
        this.f47938c.K0();
    }
}
