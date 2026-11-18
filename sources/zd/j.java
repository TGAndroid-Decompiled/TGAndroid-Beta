package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f61855a;
    public final Object f61856b;

    public j(Object obj, int i7) {
        this.f61855a = i7;
        this.f61856b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f61855a) {
            case 0:
                ((ScheduledFuture) this.f61856b).cancel(false);
                return;
            case 1:
                ((rd.l) this.f61856b).invoke(th2);
                return;
            default:
                ((l0) this.f61856b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f61855a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f61856b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f61856b).getClass().getSimpleName() + '@' + b0.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((l0) this.f61856b) + ']';
        }
    }
}
