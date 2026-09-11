package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f44261a;
    public final TaskCompletionSource f44262b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f44261a = jVar;
        this.f44262b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f44262b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f45069b == 4 && !this.f44261a.a(bVar)) {
            String str = bVar.f45070c;
            if (str != null) {
                this.f44262b.setResult(new a(bVar.f45071e, bVar.f45072f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
