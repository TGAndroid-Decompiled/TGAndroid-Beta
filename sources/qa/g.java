package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f40602a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f40602a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ra.a aVar) {
        int i10 = aVar.f41393b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f40602a.trySetResult(aVar.f41392a);
            return true;
        }
        return false;
    }
}
