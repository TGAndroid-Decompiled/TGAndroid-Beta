package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41514a;
    public final TaskCompletionSource f41515b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41514a = jVar;
        this.f41515b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41515b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42469b == 4 && !this.f41514a.a(bVar)) {
            String str = bVar.f42470c;
            if (str != null) {
                this.f41515b.setResult(new a(bVar.e, bVar.f42471f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
