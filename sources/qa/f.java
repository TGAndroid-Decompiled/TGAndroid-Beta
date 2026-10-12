package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f46004a;
    public final TaskCompletionSource f46005b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f46004a = jVar;
        this.f46005b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f46005b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(ra.b bVar) {
        if (bVar.f47357b == 4 && !this.f46004a.a(bVar)) {
            String str = bVar.f47358c;
            if (str != null) {
                this.f46005b.setResult(new a(bVar.f47359e, bVar.f47360f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
