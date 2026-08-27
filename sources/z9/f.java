package z9;

import com.google.android.gms.tasks.TaskCompletionSource;

public final class f implements i {

    public final j f50270a;

    public final TaskCompletionSource f50271b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f50270a = jVar;
        this.f50271b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f50271b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(aa.b bVar) {
        if (bVar.f206b != 4 || this.f50270a.a(bVar)) {
            return false;
        }
        String str = bVar.f207c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f50271b.setResult(new a(bVar.f208e, bVar.f209f, str));
        return true;
    }
}
