package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41542a;
    public final TaskCompletionSource f41543b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41542a = jVar;
        this.f41543b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41543b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42512b == 4 && !this.f41542a.a(bVar)) {
            String str = bVar.f42513c;
            if (str != null) {
                this.f41543b.setResult(new a(bVar.e, bVar.f42514f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
