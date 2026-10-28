package sa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f48070a;
    public final TaskCompletionSource f48071b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f48070a = jVar;
        this.f48071b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f48071b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ta.a aVar) {
        if (aVar.f48794b == 4 && !this.f48070a.a(aVar)) {
            String str = aVar.f48795c;
            if (str != null) {
                this.f48071b.setResult(new a(aVar.e, aVar.f48796f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
