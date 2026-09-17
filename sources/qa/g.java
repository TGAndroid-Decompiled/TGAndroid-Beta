package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f44292a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f44292a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ra.b bVar) {
        int i10 = bVar.f45098b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f44292a.trySetResult(bVar.f45097a);
            return true;
        }
        return false;
    }
}
