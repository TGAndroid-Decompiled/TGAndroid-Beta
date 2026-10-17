package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f45193a;
    public final TaskCompletionSource f45194b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f45193a = jVar;
        this.f45194b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f45194b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(sa.a aVar) {
        if (aVar.f46175b == 4 && !this.f45193a.a(aVar)) {
            String str = aVar.f46176c;
            if (str != null) {
                this.f45194b.setResult(new a(aVar.e, aVar.f46177f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
