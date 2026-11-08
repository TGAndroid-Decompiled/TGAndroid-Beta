package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f60082a;
    public final Object f60083b;

    public j(Object obj, int i7) {
        this.f60082a = i7;
        this.f60083b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f60082a) {
            case 0:
                ((ScheduledFuture) this.f60083b).cancel(false);
                return;
            case 1:
                ((rd.l) this.f60083b).invoke(th2);
                return;
            default:
                ((l0) this.f60083b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f60082a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f60083b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f60083b).getClass().getSimpleName() + '@' + b0.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((l0) this.f60083b) + ']';
        }
    }
}
