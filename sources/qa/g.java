package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f41516a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f41516a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ra.b bVar) {
        int i10 = bVar.f42469b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f41516a.trySetResult(bVar.f42468a);
            return true;
        }
        return false;
    }
}
