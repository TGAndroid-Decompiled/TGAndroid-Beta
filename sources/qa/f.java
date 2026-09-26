package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41511a;
    public final TaskCompletionSource f41512b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41511a = jVar;
        this.f41512b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41512b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42466b == 4 && !this.f41511a.a(bVar)) {
            String str = bVar.f42467c;
            if (str != null) {
                this.f41512b.setResult(new a(bVar.e, bVar.f42468f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
