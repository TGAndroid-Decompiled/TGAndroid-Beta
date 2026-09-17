package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f44290a;
    public final TaskCompletionSource f44291b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f44290a = jVar;
        this.f44291b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f44291b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f45098b == 4 && !this.f44290a.a(bVar)) {
            String str = bVar.f45099c;
            if (str != null) {
                this.f44291b.setResult(new a(bVar.f45100e, bVar.f45101f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
