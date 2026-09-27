package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f41544a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f41544a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ra.b bVar) {
        int i10 = bVar.f42512b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f41544a.trySetResult(bVar.f42511a);
            return true;
        }
        return false;
    }
}
