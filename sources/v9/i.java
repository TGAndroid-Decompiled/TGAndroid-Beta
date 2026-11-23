package v9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.nd0;
public final class i extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f59452n;

    public i(h hVar) {
        this.f59452n = hVar.c(new nd0(this, 24));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f59452n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f59452n;
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
        return this.f59452n.getDelay(timeUnit);
    }
}
