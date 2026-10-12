package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f45996a;
    public final TaskCompletionSource f45997b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f45996a = jVar;
        this.f45997b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f45997b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f47349b == 4 && !this.f45996a.a(bVar)) {
            String str = bVar.f47350c;
            if (str != null) {
                this.f45997b.setResult(new a(bVar.f47351e, bVar.f47352f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
