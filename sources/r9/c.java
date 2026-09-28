package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f42441a;
    public final f f42442b;
    public final Runnable f42443c;
    public final long d;
    public final long e;
    public final TimeUnit f42444f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42441a = i10;
        this.f42442b = fVar;
        this.f42443c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42444f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(n2.e eVar) {
        switch (this.f42441a) {
            case 0:
                f fVar = this.f42442b;
                return fVar.f42452b.scheduleAtFixedRate(new d(fVar, this.f42443c, eVar, 0), this.d, this.e, this.f42444f);
            default:
                f fVar2 = this.f42442b;
                return fVar2.f42452b.scheduleWithFixedDelay(new d(fVar2, this.f42443c, eVar, 2), this.d, this.e, this.f42444f);
        }
    }
}
