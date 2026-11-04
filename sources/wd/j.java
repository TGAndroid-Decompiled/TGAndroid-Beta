package wd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f57501a;
    public final Object f57502b;

    public j(Object obj, int i3) {
        this.f57501a = i3;
        this.f57502b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f57501a) {
            case 0:
                ((ScheduledFuture) this.f57502b).cancel(false);
                return;
            case 1:
                ((od.l) this.f57502b).invoke(th2);
                return;
            default:
                ((l0) this.f57502b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f57501a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f57502b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((od.l) this.f57502b).getClass().getSimpleName() + '@' + b0.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((l0) this.f57502b) + ']';
        }
    }
}
