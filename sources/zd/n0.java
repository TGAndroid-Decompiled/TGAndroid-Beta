package zd;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f51608a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f51608a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f51608a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f51608a + ']';
    }
}
