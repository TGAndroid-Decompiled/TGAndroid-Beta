package r9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k2.u;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f42163n;

    public h(g gVar) {
        this.f42163n = gVar.a(new u(this, 22));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f42163n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f42163n;
        Object obj = this.f3633a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f3619a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f42163n.getDelay(timeUnit);
    }
}
