package z8;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n5.a0;
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture f50378n;

    public h(g gVar) {
        this.f50378n = gVar.a(new a0(this, 22));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f50378n.compareTo(delayed);
    }

    @Override
    public final void d() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f50378n;
        Object obj = this.f2069a;
        if ((obj instanceof c0.a) && ((c0.a) obj).f2053a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f50378n.getDelay(timeUnit);
    }
}
