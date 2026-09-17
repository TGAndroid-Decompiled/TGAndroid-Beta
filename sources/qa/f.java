package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41245a;
    public final TaskCompletionSource f41246b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41245a = jVar;
        this.f41246b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41246b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42205b == 4 && !this.f41245a.a(bVar)) {
            String str = bVar.f42206c;
            if (str != null) {
                this.f41246b.setResult(new a(bVar.e, bVar.f42207f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
