package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41223a;
    public final TaskCompletionSource f41224b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41223a = jVar;
        this.f41224b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41224b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42183b == 4 && !this.f41223a.a(bVar)) {
            String str = bVar.f42184c;
            if (str != null) {
                this.f41224b.setResult(new a(bVar.e, bVar.f42185f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
