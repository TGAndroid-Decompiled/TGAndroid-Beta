package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f43837a;
    public final TaskCompletionSource f43838b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f43837a = jVar;
        this.f43838b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f43838b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(sa.a aVar) {
        if (aVar.f45078b == 4 && !this.f43837a.a(aVar)) {
            String str = aVar.f45079c;
            if (str != null) {
                this.f43838b.setResult(new a(aVar.e, aVar.f45080f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
