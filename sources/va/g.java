package va;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f57309a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f57309a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(wa.b bVar) {
        int i7 = bVar.f57640b;
        if (i7 == 3 || i7 == 4 || i7 == 5) {
            this.f57309a.trySetResult(bVar.f57639a);
            return true;
        }
        return false;
    }
}
