package wd;

import java.util.concurrent.ScheduledFuture;
public final class k0 implements l0 {
    public final ScheduledFuture f57508a;

    public k0(ScheduledFuture scheduledFuture) {
        this.f57508a = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f57508a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f57508a + ']';
    }
}
