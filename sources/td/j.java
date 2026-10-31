package td;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f48635a;
    public final Object f48636b;

    public j(Object obj, int i10) {
        this.f48635a = i10;
        this.f48636b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f48635a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f48636b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((ld.l) this.f48636b).invoke(th2);
                return;
            default:
                ((o0) this.f48636b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f48635a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f48636b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((ld.l) this.f48636b).getClass().getSimpleName() + '@' + e0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f48636b) + ']';
        }
    }
}
