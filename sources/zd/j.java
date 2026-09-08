package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f51593a;
    public final Object f51594b;

    public j(Object obj, int i10) {
        this.f51593a = i10;
        this.f51594b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f51593a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f51594b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((rd.l) this.f51594b).invoke(th2);
                return;
            default:
                ((o0) this.f51594b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f51593a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f51594b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f51594b).getClass().getSimpleName() + '@' + e0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f51594b) + ']';
        }
    }
}
