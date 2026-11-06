package zd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f59982a;
    public final Object f59983b;

    public j(Object obj, int i7) {
        this.f59982a = i7;
        this.f59983b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f59982a) {
            case 0:
                ((ScheduledFuture) this.f59983b).cancel(false);
                return;
            case 1:
                ((rd.l) this.f59983b).invoke(th2);
                return;
            default:
                ((l0) this.f59983b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f59982a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f59983b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.f59983b).getClass().getSimpleName() + '@' + b0.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((l0) this.f59983b) + ']';
        }
    }
}
