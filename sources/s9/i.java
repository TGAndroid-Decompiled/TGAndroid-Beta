package s9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ji.d4;
public final class i extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f45066n;

    public i(h hVar) {
        this.f45066n = hVar.a(new d4(this, 25));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f45066n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f45066n;
        Object obj = this.f4095a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f4081a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f45066n.getDelay(timeUnit);
    }
}
