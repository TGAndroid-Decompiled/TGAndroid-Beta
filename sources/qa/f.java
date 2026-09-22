package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f41219a;
    public final TaskCompletionSource f41220b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f41219a = jVar;
        this.f41220b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f41220b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f42179b == 4 && !this.f41219a.a(bVar)) {
            String str = bVar.f42180c;
            if (str != null) {
                this.f41220b.setResult(new a(bVar.e, bVar.f42181f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
