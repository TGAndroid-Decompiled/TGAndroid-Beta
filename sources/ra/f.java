package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f45591a;
    public final TaskCompletionSource f45592b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f45591a = jVar;
        this.f45592b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f45592b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(sa.a aVar) {
        if (aVar.f46580b == 4 && !this.f45591a.a(aVar)) {
            String str = aVar.f46581c;
            if (str != null) {
                this.f45592b.setResult(new a(aVar.e, aVar.f46582f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
