package r9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n4.l;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f47332n;

    public h(g gVar) {
        this.f47332n = gVar.a(new l(this));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f47332n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f47332n;
        Object obj = this.f3971a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f3955a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f47332n.getDelay(timeUnit);
    }
}
