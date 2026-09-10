package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f40600a;
    public final TaskCompletionSource f40601b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f40600a = jVar;
        this.f40601b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f40601b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.a aVar) {
        if (aVar.f41393b == 4 && !this.f40600a.a(aVar)) {
            String str = aVar.f41394c;
            if (str != null) {
                this.f40601b.setResult(new a(aVar.e, aVar.f41395f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
