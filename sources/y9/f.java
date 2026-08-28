package y9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f49674a;
    public final TaskCompletionSource f49675b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f49674a = jVar;
        this.f49675b = taskCompletionSource;
    }

    @Override
    public final boolean a(z9.a aVar) {
        if (aVar.f50388b == 4 && !this.f49674a.a(aVar)) {
            String str = aVar.f50389c;
            if (str != null) {
                this.f49675b.setResult(new a(aVar.f50390e, aVar.f50391f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }

    @Override
    public final boolean b(Exception exc) {
        this.f49675b.trySetException(exc);
        return true;
    }
}
