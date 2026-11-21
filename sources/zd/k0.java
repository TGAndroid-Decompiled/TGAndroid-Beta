package zd;

import java.util.concurrent.ScheduledFuture;
public final class k0 implements l0 {
    public final ScheduledFuture f61903a;

    public k0(ScheduledFuture scheduledFuture) {
        this.f61903a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f61903a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f61903a + ']';
    }
}
