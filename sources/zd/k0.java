package zd;

import java.util.concurrent.ScheduledFuture;
public final class k0 implements l0 {
    public final ScheduledFuture f59965a;

    public k0(ScheduledFuture scheduledFuture) {
        this.f59965a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f59965a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f59965a + ']';
    }
}
