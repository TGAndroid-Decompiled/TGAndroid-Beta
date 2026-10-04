package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f44891a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f44891a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ra.b bVar) {
        int i10 = bVar.f45969b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f44891a.trySetResult(bVar.f45968a);
            return true;
        }
        return false;
    }
}
