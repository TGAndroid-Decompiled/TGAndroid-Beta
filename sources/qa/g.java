package qa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f44263a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f44263a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(ra.b bVar) {
        int i10 = bVar.f45069b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f44263a.trySetResult(bVar.f45068a);
            return true;
        }
        return false;
    }
}
