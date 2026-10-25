package sa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f48031a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f48031a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ta.a aVar) {
        int i10 = aVar.f48756b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f48031a.trySetResult(aVar.f48755a);
            return true;
        }
        return false;
    }
}
