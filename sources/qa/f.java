package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f46137a;
    public final TaskCompletionSource f46138b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f46137a = jVar;
        this.f46138b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f46138b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f47225b == 4 && !this.f46137a.a(bVar)) {
            String str = bVar.f47226c;
            if (str != null) {
                this.f46138b.setResult(new a(bVar.f47227e, bVar.f47228f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
