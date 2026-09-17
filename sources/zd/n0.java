package zd;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f48936a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f48936a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f48936a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f48936a + ']';
    }
}
