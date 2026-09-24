package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f49164a;
    public final Object f49165b;

    public j(Object obj, int i10) {
        this.f49164a = i10;
        this.f49165b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f49164a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f49165b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((rd.l) this.f49165b).invoke(th2);
                return;
            default:
                ((o0) this.f49165b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f49164a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f49165b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f49165b).getClass().getSimpleName() + '@' + e0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f49165b) + ']';
        }
    }
}
