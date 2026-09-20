package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f49202a;
    public final Object f49203b;

    public j(Object obj, int i10) {
        this.f49202a = i10;
        this.f49203b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f49202a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f49203b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((rd.l) this.f49203b).invoke(th2);
                return;
            default:
                ((o0) this.f49203b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f49202a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f49203b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f49203b).getClass().getSimpleName() + '@' + e0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f49203b) + ']';
        }
    }
}
