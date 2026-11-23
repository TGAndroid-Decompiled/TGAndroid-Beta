package va;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f59357a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f59357a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(wa.b bVar) {
        int i7 = bVar.f59654b;
        if (i7 == 3 || i7 == 4 || i7 == 5) {
            this.f59357a.trySetResult(bVar.f59653a);
            return true;
        }
        return false;
    }
}
