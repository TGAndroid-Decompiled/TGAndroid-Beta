package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f46171a;
    public final TaskCompletionSource f46172b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f46171a = jVar;
        this.f46172b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f46172b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f47259b == 4 && !this.f46171a.a(bVar)) {
            String str = bVar.f47260c;
            if (str != null) {
                this.f46172b.setResult(new a(bVar.f47261e, bVar.f47262f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
