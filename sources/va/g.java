package va;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f59390a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f59390a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(wa.b bVar) {
        int i7 = bVar.f59685b;
        if (i7 == 3 || i7 == 4 || i7 == 5) {
            this.f59390a.trySetResult(bVar.f59684a);
            return true;
        }
        return false;
    }
}
