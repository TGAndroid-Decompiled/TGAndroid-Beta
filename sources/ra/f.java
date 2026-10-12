package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f44078a;
    public final TaskCompletionSource f44079b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f44078a = jVar;
        this.f44079b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f44079b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(sa.a aVar) {
        if (aVar.f45078b == 4 && !this.f44078a.a(aVar)) {
            String str = aVar.f45079c;
            if (str != null) {
                this.f44079b.setResult(new a(aVar.e, aVar.f45080f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
