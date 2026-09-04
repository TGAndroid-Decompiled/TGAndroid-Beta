package zd;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f51576a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f51576a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f51576a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f51576a + ']';
    }
}
