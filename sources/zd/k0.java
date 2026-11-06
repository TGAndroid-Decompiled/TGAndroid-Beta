package zd;

import java.util.concurrent.ScheduledFuture;
public final class k0 implements l0 {
    public final ScheduledFuture f59989a;

    public k0(ScheduledFuture scheduledFuture) {
        this.f59989a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f59989a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f59989a + ']';
    }
}
