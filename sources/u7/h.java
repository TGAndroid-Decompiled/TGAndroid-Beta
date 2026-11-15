package u7;

import a8.l8;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h extends w {
    public final TaskCompletionSource f57877b;
    public final j f57878c;

    public h(TaskCompletionSource taskCompletionSource, j jVar) {
        this.f57877b = taskCompletionSource;
        this.f57878c = jVar;
    }

    @Override
    public final void Q0(u uVar) {
        l8.a(uVar.f57900a, null, this.f57877b);
    }

    @Override
    public final void zze() {
        this.f57878c.m1();
    }
}
