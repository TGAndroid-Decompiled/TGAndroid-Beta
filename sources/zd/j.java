package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f59988a;
    public final Object f59989b;

    public j(Object obj, int i7) {
        this.f59988a = i7;
        this.f59989b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f59988a) {
            case 0:
                ((ScheduledFuture) this.f59989b).cancel(false);
                return;
            case 1:
                ((rd.l) this.f59989b).invoke(th2);
                return;
            default:
                ((l0) this.f59989b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f59988a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f59989b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f59989b).getClass().getSimpleName() + '@' + b0.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((l0) this.f59989b) + ']';
        }
    }
}
