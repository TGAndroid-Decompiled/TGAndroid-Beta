package v9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v4.e0;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f59330n;

    public h(g gVar) {
        this.f59330n = gVar.a(new e0(this));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f59330n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f59330n;
        Object obj = this.f4332a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f4316a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f59330n.getDelay(timeUnit);
    }
}
