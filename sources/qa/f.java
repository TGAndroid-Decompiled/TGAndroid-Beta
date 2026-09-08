package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f44289a;
    public final TaskCompletionSource f44290b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f44289a = jVar;
        this.f44290b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f44290b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f45097b == 4 && !this.f44289a.a(bVar)) {
            String str = bVar.f45098c;
            if (str != null) {
                this.f44290b.setResult(new a(bVar.f45099e, bVar.f45100f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
