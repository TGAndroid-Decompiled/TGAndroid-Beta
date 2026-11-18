package zd;

import java.util.concurrent.ScheduledFuture;
public final class k0 implements l0 {
    public final ScheduledFuture f61861a;

    public k0(ScheduledFuture scheduledFuture) {
        this.f61861a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f61861a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f61861a + ']';
    }
}
