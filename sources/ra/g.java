package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f46483a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f46483a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(sa.a aVar) {
        int i10 = aVar.f48134b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f46483a.trySetResult(aVar.f48133a);
            return true;
        }
        return false;
    }
}
