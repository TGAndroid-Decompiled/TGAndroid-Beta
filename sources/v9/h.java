package v9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v4.f0;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f59324n;

    public h(g gVar) {
        this.f59324n = gVar.a(new f0(this));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f59324n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f59324n;
        Object obj = this.f4340a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f4324a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f59324n.getDelay(timeUnit);
    }
}
