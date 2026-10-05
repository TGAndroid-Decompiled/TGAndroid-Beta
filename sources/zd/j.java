package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f53261a;
    public final Object f53262b;

    public j(Object obj, int i10) {
        this.f53261a = i10;
        this.f53262b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f53261a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f53262b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((rd.l) this.f53262b).invoke(th2);
                return;
            default:
                ((o0) this.f53262b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f53261a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f53262b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f53262b).getClass().getSimpleName() + '@' + e0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f53262b) + ']';
        }
    }
}
