package zd;

import java.util.concurrent.ScheduledFuture;
public final class k0 implements l0 {
    public final ScheduledFuture f61297a;

    public k0(ScheduledFuture scheduledFuture) {
        this.f61297a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f61297a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f61297a + ']';
    }
}
