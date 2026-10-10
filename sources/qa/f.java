package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f46103a;
    public final TaskCompletionSource f46104b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f46103a = jVar;
        this.f46104b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f46104b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f47179b == 4 && !this.f46103a.a(bVar)) {
            String str = bVar.f47180c;
            if (str != null) {
                this.f46104b.setResult(new a(bVar.f47181e, bVar.f47182f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
