package sa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f48072a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f48072a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ta.a aVar) {
        int i10 = aVar.f48794b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f48072a.trySetResult(aVar.f48793a);
            return true;
        }
        return false;
    }
}
