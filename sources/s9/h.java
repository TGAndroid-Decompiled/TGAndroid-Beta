package s9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f46135n;

    public h(g gVar) {
        this.f46135n = gVar.a(new le.b(this, 22));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f46135n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f46135n;
        Object obj = this.f4468a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f4454a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f46135n.getDelay(timeUnit);
    }
}
