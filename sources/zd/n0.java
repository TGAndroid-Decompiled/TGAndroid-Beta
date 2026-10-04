package zd;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f53248a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f53248a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f53248a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f53248a + ']';
    }
}
