package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f48021a;
    public final Object f48022b;

    public j(Object obj, int i10) {
        this.f48021a = i10;
        this.f48022b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f48021a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f48022b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((rd.l) this.f48022b).invoke(th2);
                return;
            default:
                ((o0) this.f48022b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f48021a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f48022b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f48022b).getClass().getSimpleName() + '@' + e0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f48022b) + ']';
        }
    }
}
