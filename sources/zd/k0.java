package zd;

import java.util.concurrent.ScheduledFuture;
public final class k0 implements l0 {
    public final ScheduledFuture f61872a;

    public k0(ScheduledFuture scheduledFuture) {
        this.f61872a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f61872a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f61872a + ']';
    }
}
