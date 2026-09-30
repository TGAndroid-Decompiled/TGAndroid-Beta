package zd;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f49188a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f49188a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f49188a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f49188a + ']';
    }
}
