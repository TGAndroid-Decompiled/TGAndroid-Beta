package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f44889a;
    public final TaskCompletionSource f44890b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f44889a = jVar;
        this.f44890b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f44890b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f45969b == 4 && !this.f44889a.a(bVar)) {
            String str = bVar.f45970c;
            if (str != null) {
                this.f44890b.setResult(new a(bVar.f45971e, bVar.f45972f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
