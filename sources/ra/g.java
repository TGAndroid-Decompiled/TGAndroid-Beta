package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f45215a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f45215a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(sa.a aVar) {
        int i10 = aVar.f46195b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f45215a.trySetResult(aVar.f46194a);
            return true;
        }
        return false;
    }
}
