package s9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f46183n;

    public h(g gVar) {
        this.f46183n = gVar.a(new k0.b(this, 28));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f46183n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f46183n;
        Object obj = this.f4470a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f4456a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f46183n.getDelay(timeUnit);
    }
}
