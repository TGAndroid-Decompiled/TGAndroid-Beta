package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f45213a;
    public final TaskCompletionSource f45214b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f45213a = jVar;
        this.f45214b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f45214b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(sa.a aVar) {
        if (aVar.f46195b == 4 && !this.f45213a.a(aVar)) {
            String str = aVar.f46196c;
            if (str != null) {
                this.f45214b.setResult(new a(aVar.e, aVar.f46197f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
