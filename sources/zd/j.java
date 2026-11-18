package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f61854a;
    public final Object f61855b;

    public j(Object obj, int i7) {
        this.f61854a = i7;
        this.f61855b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f61854a) {
            case 0:
                ((ScheduledFuture) this.f61855b).cancel(false);
                return;
            case 1:
                ((rd.l) this.f61855b).invoke(th2);
                return;
            default:
                ((l0) this.f61855b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f61854a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f61855b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f61855b).getClass().getSimpleName() + '@' + b0.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((l0) this.f61855b) + ']';
        }
    }
}
