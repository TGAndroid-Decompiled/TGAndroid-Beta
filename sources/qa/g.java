package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f46139a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f46139a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ra.b bVar) {
        int i10 = bVar.f47225b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f46139a.trySetResult(bVar.f47224a);
            return true;
        }
        return false;
    }
}
