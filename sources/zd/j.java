package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f60091a;
    public final Object f60092b;

    public j(Object obj, int i7) {
        this.f60091a = i7;
        this.f60092b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f60091a) {
            case 0:
                ((ScheduledFuture) this.f60092b).cancel(false);
                return;
            case 1:
                ((rd.l) this.f60092b).invoke(th2);
                return;
            default:
                ((l0) this.f60092b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f60091a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f60092b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f60092b).getClass().getSimpleName() + '@' + b0.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((l0) this.f60092b) + ']';
        }
    }
}
