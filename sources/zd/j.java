package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f61865a;
    public final Object f61866b;

    public j(Object obj, int i7) {
        this.f61865a = i7;
        this.f61866b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f61865a) {
            case 0:
                ((ScheduledFuture) this.f61866b).cancel(false);
                return;
            case 1:
                ((rd.l) this.f61866b).invoke(th2);
                return;
            default:
                ((l0) this.f61866b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f61865a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f61866b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f61866b).getClass().getSimpleName() + '@' + b0.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((l0) this.f61866b) + ']';
        }
    }
}
