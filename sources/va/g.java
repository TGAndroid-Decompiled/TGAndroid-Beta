package va;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f57313a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f57313a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(wa.b bVar) {
        int i7 = bVar.f57641b;
        if (i7 == 3 || i7 == 4 || i7 == 5) {
            this.f57313a.trySetResult(bVar.f57640a);
            return true;
        }
        return false;
    }
}
