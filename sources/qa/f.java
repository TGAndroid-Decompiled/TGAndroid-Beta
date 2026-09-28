package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41513a;
    public final TaskCompletionSource f41514b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41513a = jVar;
        this.f41514b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41514b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42468b == 4 && !this.f41513a.a(bVar)) {
            String str = bVar.f42469c;
            if (str != null) {
                this.f41514b.setResult(new a(bVar.e, bVar.f42470f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
