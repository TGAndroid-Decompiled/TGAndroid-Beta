package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f45175a;
    public final TaskCompletionSource f45176b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f45175a = jVar;
        this.f45176b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f45176b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(sa.a aVar) {
        if (aVar.f46154b == 4 && !this.f45175a.a(aVar)) {
            String str = aVar.f46155c;
            if (str != null) {
                this.f45176b.setResult(new a(aVar.e, aVar.f46156f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
