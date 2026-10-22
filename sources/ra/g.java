package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f45180a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f45180a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(sa.a aVar) {
        int i10 = aVar.f46157b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f45180a.trySetResult(aVar.f46156a);
            return true;
        }
        return false;
    }
}
