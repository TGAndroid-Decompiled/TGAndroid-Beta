package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41498a;
    public final TaskCompletionSource f41499b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41498a = jVar;
        this.f41499b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41499b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42453b == 4 && !this.f41498a.a(bVar)) {
            String str = bVar.f42454c;
            if (str != null) {
                this.f41499b.setResult(new a(bVar.e, bVar.f42455f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
