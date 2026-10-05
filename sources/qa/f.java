package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f44903a;
    public final TaskCompletionSource f44904b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f44903a = jVar;
        this.f44904b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f44904b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f45983b == 4 && !this.f44903a.a(bVar)) {
            String str = bVar.f45984c;
            if (str != null) {
                this.f44904b.setResult(new a(bVar.f45985e, bVar.f45986f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
