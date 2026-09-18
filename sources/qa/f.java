package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41250a;
    public final TaskCompletionSource f41251b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41250a = jVar;
        this.f41251b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41251b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42210b == 4 && !this.f41250a.a(bVar)) {
            String str = bVar.f42211c;
            if (str != null) {
                this.f41251b.setResult(new a(bVar.e, bVar.f42212f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
