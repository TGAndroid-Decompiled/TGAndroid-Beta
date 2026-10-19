package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f45165a;
    public final TaskCompletionSource f45166b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f45165a = jVar;
        this.f45166b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f45166b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(sa.a aVar) {
        if (aVar.f46147b == 4 && !this.f45165a.a(aVar)) {
            String str = aVar.f46148c;
            if (str != null) {
                this.f45166b.setResult(new a(aVar.e, aVar.f46149f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
