package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f44896a;
    public final TaskCompletionSource f44897b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f44896a = jVar;
        this.f44897b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f44897b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f45976b == 4 && !this.f44896a.a(bVar)) {
            String str = bVar.f45977c;
            if (str != null) {
                this.f44897b.setResult(new a(bVar.f45978e, bVar.f45979f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
