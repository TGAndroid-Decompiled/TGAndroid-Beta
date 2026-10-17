package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f45195a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f45195a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(sa.a aVar) {
        int i10 = aVar.f46175b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f45195a.trySetResult(aVar.f46174a);
            return true;
        }
        return false;
    }
}
