package sa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f48029a;
    public final TaskCompletionSource f48030b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f48029a = jVar;
        this.f48030b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f48030b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ta.a aVar) {
        if (aVar.f48756b == 4 && !this.f48029a.a(aVar)) {
            String str = aVar.f48757c;
            if (str != null) {
                this.f48030b.setResult(new a(aVar.e, aVar.f48758f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
