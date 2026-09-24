package zd;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f49175a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f49175a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f49175a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f49175a + ']';
    }
}
