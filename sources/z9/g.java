package z9;

import com.google.android.gms.tasks.TaskCompletionSource;

public final class g implements i {

    public final TaskCompletionSource f50272a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f50272a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(aa.b bVar) {
        int i10 = bVar.f206b;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return false;
        }
        this.f50272a.trySetResult(bVar.f205a);
        return true;
    }
}
