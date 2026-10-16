package s9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class d implements h {
    public final int f45054a;
    public final g f45055b;
    public final Runnable f45056c;
    public final long d;
    public final long e;
    public final TimeUnit f45057f;

    public d(g gVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f45054a = i10;
        this.f45055b = gVar;
        this.f45056c = runnable;
        this.d = j10;
        this.e = j11;
        this.f45057f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(m.h hVar) {
        switch (this.f45054a) {
            case 0:
                g gVar = this.f45055b;
                return gVar.f45065b.scheduleAtFixedRate(new e(gVar, this.f45056c, hVar, 0), this.d, this.e, this.f45057f);
            default:
                g gVar2 = this.f45055b;
                return gVar2.f45065b.scheduleWithFixedDelay(new e(gVar2, this.f45056c, hVar, 2), this.d, this.e, this.f45057f);
        }
    }
}
