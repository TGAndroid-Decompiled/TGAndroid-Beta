package v9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.rt;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f57286n;

    public h(g gVar) {
        this.f57286n = gVar.a(new rt(this, 24));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f57286n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z9;
        ScheduledFuture scheduledFuture = this.f57286n;
        Object obj = this.f5235a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f5219a) {
            z9 = true;
        } else {
            z9 = false;
        }
        scheduledFuture.cancel(z9);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f57286n.getDelay(timeUnit);
    }
}
