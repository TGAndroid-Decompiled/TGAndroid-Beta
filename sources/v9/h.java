package v9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.qt;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f57282n;

    public h(g gVar) {
        this.f57282n = gVar.a(new qt(this, 24));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f57282n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z9;
        ScheduledFuture scheduledFuture = this.f57282n;
        Object obj = this.f5240a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f5224a) {
            z9 = true;
        } else {
            z9 = false;
        }
        scheduledFuture.cancel(z9);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f57282n.getDelay(timeUnit);
    }
}
