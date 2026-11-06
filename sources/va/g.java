package va;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f57208a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f57208a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(wa.b bVar) {
        int i7 = bVar.f57536b;
        if (i7 == 3 || i7 == 4 || i7 == 5) {
            this.f57208a.trySetResult(bVar.f57535a);
            return true;
        }
        return false;
    }
}
