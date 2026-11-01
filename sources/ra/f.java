package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f46481a;
    public final TaskCompletionSource f46482b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f46481a = jVar;
        this.f46482b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f46482b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(sa.a aVar) {
        if (aVar.f48134b == 4 && !this.f46481a.a(aVar)) {
            String str = aVar.f48135c;
            if (str != null) {
                this.f46482b.setResult(new a(aVar.e, str, aVar.f48136f));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
