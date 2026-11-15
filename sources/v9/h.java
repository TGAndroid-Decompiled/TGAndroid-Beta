package v9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.cf;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f58755n;

    public h(g gVar) {
        this.f58755n = gVar.a(new cf(this));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f58755n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f58755n;
        Object obj = this.f4056a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f4040a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f58755n.getDelay(timeUnit);
    }
}
