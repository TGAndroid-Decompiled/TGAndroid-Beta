package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f61984a;
    public final Object f61985b;

    public j(Object obj, int i7) {
        this.f61984a = i7;
        this.f61985b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f61984a) {
            case 0:
                ((ScheduledFuture) this.f61985b).cancel(false);
                return;
            case 1:
                ((rd.l) this.f61985b).invoke(th2);
                return;
            default:
                ((l0) this.f61985b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f61984a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f61985b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f61985b).getClass().getSimpleName() + '@' + b0.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((l0) this.f61985b) + ']';
        }
    }
}
