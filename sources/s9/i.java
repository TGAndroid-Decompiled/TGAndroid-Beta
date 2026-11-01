package s9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class i extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f48125n;

    public i(h hVar) {
        this.f48125n = hVar.a(new g(this));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f48125n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f48125n;
        Object obj = this.f3505a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f3491a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f48125n.getDelay(timeUnit);
    }
}
