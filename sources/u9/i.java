package u9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.i9;
public final class i extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f55766n;

    public i(h hVar) {
        this.f55766n = hVar.a(new i9(this, 24));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f55766n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f55766n;
        Object obj = this.f3949a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f3933a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f55766n.getDelay(timeUnit);
    }
}
