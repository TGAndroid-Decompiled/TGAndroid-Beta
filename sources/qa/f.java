package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41526a;
    public final TaskCompletionSource f41527b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41526a = jVar;
        this.f41527b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41527b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42481b == 4 && !this.f41526a.a(bVar)) {
            String str = bVar.f42482c;
            if (str != null) {
                this.f41527b.setResult(new a(bVar.e, bVar.f42483f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
