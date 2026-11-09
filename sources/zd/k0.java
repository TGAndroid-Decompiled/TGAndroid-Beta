package zd;

import java.util.concurrent.ScheduledFuture;
public final class k0 implements l0 {
    public final ScheduledFuture f60098a;

    public k0(ScheduledFuture scheduledFuture) {
        this.f60098a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f60098a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f60098a + ']';
    }
}
