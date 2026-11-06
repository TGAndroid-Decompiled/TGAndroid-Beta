package va;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f57184a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f57184a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(wa.b bVar) {
        int i7 = bVar.f57512b;
        if (i7 == 3 || i7 == 4 || i7 == 5) {
            this.f57184a.trySetResult(bVar.f57511a);
            return true;
        }
        return false;
    }
}
