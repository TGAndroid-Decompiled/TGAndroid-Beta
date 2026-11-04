package ua;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class h implements j {
    public final TaskCompletionSource f55800a;

    public h(TaskCompletionSource taskCompletionSource) {
        this.f55800a = taskCompletionSource;
    }

    @Override
    public final boolean a(va.b bVar) {
        int i3 = bVar.f56493b;
        if (i3 == 3 || i3 == 4 || i3 == 5) {
            this.f55800a.trySetResult(bVar.f56492a);
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(Exception exc) {
        return false;
    }
}
