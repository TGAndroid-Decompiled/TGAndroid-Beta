package sa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f48032a;
    public final TaskCompletionSource f48033b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f48032a = jVar;
        this.f48033b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f48033b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ta.a aVar) {
        if (aVar.f48759b == 4 && !this.f48032a.a(aVar)) {
            String str = aVar.f48760c;
            if (str != null) {
                this.f48033b.setResult(new a(aVar.e, aVar.f48761f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
