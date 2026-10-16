package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f43839a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f43839a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(sa.a aVar) {
        int i10 = aVar.f45078b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f43839a.trySetResult(aVar.f45077a);
            return true;
        }
        return false;
    }
}
