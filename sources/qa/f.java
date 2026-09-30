package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41611a;
    public final TaskCompletionSource f41612b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41611a = jVar;
        this.f41612b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41612b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42572b == 4 && !this.f41611a.a(bVar)) {
            String str = bVar.f42573c;
            if (str != null) {
                this.f41612b.setResult(new a(bVar.e, bVar.f42574f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
