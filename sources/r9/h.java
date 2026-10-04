package r9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f45959n;

    public h(g gVar) {
        this.f45959n = gVar.a(new k2.e(this, 17));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f45959n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f45959n;
        Object obj = this.f3923a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f3907a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f45959n.getDelay(timeUnit);
    }
}
