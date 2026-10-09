package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f46059a;
    public final TaskCompletionSource f46060b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f46059a = jVar;
        this.f46060b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f46060b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f47135b == 4 && !this.f46059a.a(bVar)) {
            String str = bVar.f47136c;
            if (str != null) {
                this.f46060b.setResult(new a(bVar.f47137e, bVar.f47138f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
