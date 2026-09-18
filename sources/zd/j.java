package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f48930a;
    public final Object f48931b;

    public j(Object obj, int i10) {
        this.f48930a = i10;
        this.f48931b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f48930a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f48931b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((rd.l) this.f48931b).invoke(th2);
                return;
            default:
                ((o0) this.f48931b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f48930a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f48931b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f48931b).getClass().getSimpleName() + '@' + e0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f48931b) + ']';
        }
    }
}
