package zd;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f49229a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f49229a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f49229a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f49229a + ']';
    }
}
