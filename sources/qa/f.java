package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41484a;
    public final TaskCompletionSource f41485b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41484a = jVar;
        this.f41485b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41485b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42437b == 4 && !this.f41484a.a(bVar)) {
            String str = bVar.f42438c;
            if (str != null) {
                this.f41485b.setResult(new a(bVar.e, bVar.f42439f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
