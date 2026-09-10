package zd;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f48032a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f48032a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f48032a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f48032a + ']';
    }
}
