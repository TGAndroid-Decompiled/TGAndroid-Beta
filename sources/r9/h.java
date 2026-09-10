package r9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f41384n;

    public h(g gVar) {
        this.f41384n = gVar.a(new l2.h(this, 18));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f41384n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f41384n;
        Object obj = this.f4050a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f4036a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f41384n.getDelay(timeUnit);
    }
}
