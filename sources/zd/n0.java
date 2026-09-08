package zd;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f51607a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f51607a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f51607a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f51607a + ']';
    }
}
