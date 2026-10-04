package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f44888a;
    public final TaskCompletionSource f44889b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f44888a = jVar;
        this.f44889b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f44889b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f45968b == 4 && !this.f44888a.a(bVar)) {
            String str = bVar.f45969c;
            if (str != null) {
                this.f44889b.setResult(new a(bVar.f45970e, bVar.f45971f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
