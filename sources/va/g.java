package va;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f59351a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f59351a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(wa.b bVar) {
        int i7 = bVar.f59646b;
        if (i7 == 3 || i7 == 4 || i7 == 5) {
            this.f59351a.trySetResult(bVar.f59645a);
            return true;
        }
        return false;
    }
}
