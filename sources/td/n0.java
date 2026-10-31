package td;

import java.util.concurrent.ScheduledFuture;
public final class n0 implements o0 {
    public final ScheduledFuture f48646a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f48646a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f48646a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f48646a + ']';
    }
}
