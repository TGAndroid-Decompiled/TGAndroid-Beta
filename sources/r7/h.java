package r7;

import com.google.android.gms.tasks.TaskCompletionSource;
import v7.f5;
public final class h extends x {
    public final TaskCompletionSource f44967b;
    public final i f44968c;

    public h(TaskCompletionSource taskCompletionSource, i iVar) {
        this.f44967b = taskCompletionSource;
        this.f44968c = iVar;
    }

    @Override
    public final void p0(v vVar) {
        f5.a(vVar.f44998a, null, this.f44967b);
    }

    @Override
    public final void zze() {
        this.f44968c.L0();
    }
}
