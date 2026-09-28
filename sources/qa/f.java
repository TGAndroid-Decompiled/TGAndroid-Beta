package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41512a;
    public final TaskCompletionSource f41513b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41512a = jVar;
        this.f41513b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41513b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42467b == 4 && !this.f41512a.a(bVar)) {
            String str = bVar.f42468c;
            if (str != null) {
                this.f41513b.setResult(new a(bVar.e, bVar.f42469f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
