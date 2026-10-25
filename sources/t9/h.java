package t9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import li.e3;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f48744n;

    public h(g gVar) {
        this.f48744n = gVar.a(new e3(this, 20));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f48744n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f48744n;
        Object obj = this.f5906a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f5892a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f48744n.getDelay(timeUnit);
    }
}
