package zd;

import java.util.concurrent.ScheduledFuture;
public final class k0 implements l0 {
    public final ScheduledFuture f60096a;

    public k0(ScheduledFuture scheduledFuture) {
        this.f60096a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f60096a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f60096a + ']';
    }
}
