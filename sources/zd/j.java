package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f60081a;
    public final Object f60082b;

    public j(Object obj, int i7) {
        this.f60081a = i7;
        this.f60082b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f60081a) {
            case 0:
                ((ScheduledFuture) this.f60082b).cancel(false);
                return;
            case 1:
                ((rd.l) this.f60082b).invoke(th2);
                return;
            default:
                ((l0) this.f60082b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f60081a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f60082b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f60082b).getClass().getSimpleName() + '@' + b0.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((l0) this.f60082b) + ']';
        }
    }
}
