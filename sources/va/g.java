package va;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f59394a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f59394a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(wa.b bVar) {
        int i7 = bVar.f59689b;
        if (i7 == 3 || i7 == 4 || i7 == 5) {
            this.f59394a.trySetResult(bVar.f59688a);
            return true;
        }
        return false;
    }
}
