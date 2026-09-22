package r9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f42487n;

    public h(g gVar) {
        this.f42487n = gVar.a(new l.d(this, 19));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f42487n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f42487n;
        Object obj = this.f3635a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f3621a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f42487n.getDelay(timeUnit);
    }
}
