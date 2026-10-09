package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f46057a;
    public final TaskCompletionSource f46058b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f46057a = jVar;
        this.f46058b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f46058b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f47133b == 4 && !this.f46057a.a(bVar)) {
            String str = bVar.f47134c;
            if (str != null) {
                this.f46058b.setResult(new a(bVar.f47135e, bVar.f47136f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
