package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41175a;
    public final TaskCompletionSource f41176b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41175a = jVar;
        this.f41176b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41176b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42134b == 4 && !this.f41175a.a(bVar)) {
            String str = bVar.f42135c;
            if (str != null) {
                this.f41176b.setResult(new a(bVar.e, bVar.f42136f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
