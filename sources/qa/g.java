package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f41177a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f41177a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ra.b bVar) {
        int i10 = bVar.f42134b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f41177a.trySetResult(bVar.f42133a);
            return true;
        }
        return false;
    }
}
