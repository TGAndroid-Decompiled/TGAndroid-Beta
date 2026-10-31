package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f46470a;
    public final TaskCompletionSource f46471b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f46470a = jVar;
        this.f46471b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f46471b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(sa.a aVar) {
        if (aVar.f48123b == 4 && !this.f46470a.a(aVar)) {
            String str = aVar.f48124c;
            if (str != null) {
                this.f46471b.setResult(new a(aVar.e, str, aVar.f48125f));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
