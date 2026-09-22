package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41547a;
    public final TaskCompletionSource f41548b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41547a = jVar;
        this.f41548b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41548b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42502b == 4 && !this.f41547a.a(bVar)) {
            String str = bVar.f42503c;
            if (str != null) {
                this.f41548b.setResult(new a(bVar.e, bVar.f42504f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
