package zd;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f48941a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f48941a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f48941a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f48941a + ']';
    }
}
