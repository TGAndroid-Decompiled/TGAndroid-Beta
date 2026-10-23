package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f45179a;
    public final TaskCompletionSource f45180b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f45179a = jVar;
        this.f45180b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f45180b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(sa.a aVar) {
        if (aVar.f46158b == 4 && !this.f45179a.a(aVar)) {
            String str = aVar.f46159c;
            if (str != null) {
                this.f45180b.setResult(new a(aVar.e, aVar.f46160f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
