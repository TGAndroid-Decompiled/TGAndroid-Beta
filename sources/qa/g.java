package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f44264a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f44264a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ra.b bVar) {
        int i10 = bVar.f45070b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f44264a.trySetResult(bVar.f45069a);
            return true;
        }
        return false;
    }
}
