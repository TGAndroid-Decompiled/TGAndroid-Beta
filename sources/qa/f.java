package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f44262a;
    public final TaskCompletionSource f44263b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f44262a = jVar;
        this.f44263b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f44263b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f45070b == 4 && !this.f44262a.a(bVar)) {
            String str = bVar.f45071c;
            if (str != null) {
                this.f44263b.setResult(new a(bVar.f45072e, bVar.f45073f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
