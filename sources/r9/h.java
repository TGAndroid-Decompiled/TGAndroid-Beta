package r9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f45051n;

    public h(g gVar) {
        this.f45051n = gVar.a(new l.d(this, 22));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f45051n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f45051n;
        Object obj = this.f4117a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f4101a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f45051n.getDelay(timeUnit);
    }
}
