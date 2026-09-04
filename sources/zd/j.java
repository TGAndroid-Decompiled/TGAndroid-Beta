package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f51562a;
    public final Object f51563b;

    public j(Object obj, int i10) {
        this.f51562a = i10;
        this.f51563b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f51562a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f51563b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((rd.l) this.f51563b).invoke(th2);
                return;
            default:
                ((o0) this.f51563b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f51562a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f51563b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f51563b).getClass().getSimpleName() + '@' + e0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f51563b) + ']';
        }
    }
}
