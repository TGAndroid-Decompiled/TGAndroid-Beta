package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f45590a;
    public final TaskCompletionSource f45591b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f45590a = jVar;
        this.f45591b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f45591b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(sa.a aVar) {
        if (aVar.f46579b == 4 && !this.f45590a.a(aVar)) {
            String str = aVar.f46580c;
            if (str != null) {
                this.f45591b.setResult(new a(aVar.e, aVar.f46581f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
