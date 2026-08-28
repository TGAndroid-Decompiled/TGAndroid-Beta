package y9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f49676a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f49676a = taskCompletionSource;
    }

    @Override
    public final boolean a(z9.a aVar) {
        int i9 = aVar.f50388b;
        if (i9 == 3 || i9 == 4 || i9 == 5) {
            this.f49676a.trySetResult(aVar.f50387a);
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(Exception exc) {
        return false;
    }
}
