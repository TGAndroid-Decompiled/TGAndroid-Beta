package r9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m.f3;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f47118n;

    public h(g gVar) {
        this.f47118n = gVar.a(new f3(this, 17));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f47118n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f47118n;
        Object obj = this.f3972a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f3956a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f47118n.getDelay(timeUnit);
    }
}
