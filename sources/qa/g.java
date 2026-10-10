package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f46105a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f46105a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ra.b bVar) {
        int i10 = bVar.f47179b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f46105a.trySetResult(bVar.f47178a);
            return true;
        }
        return false;
    }
}
