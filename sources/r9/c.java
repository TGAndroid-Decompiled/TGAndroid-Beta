package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f45039a;
    public final f f45040b;
    public final Runnable f45041c;
    public final long d;
    public final long f45042e;
    public final TimeUnit f45043f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f45039a = i10;
        this.f45040b = fVar;
        this.f45041c = runnable;
        this.d = j3;
        this.f45042e = j10;
        this.f45043f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(l.d dVar) {
        switch (this.f45039a) {
            case 0:
                f fVar = this.f45040b;
                return fVar.f45051b.scheduleAtFixedRate(new d(fVar, this.f45041c, dVar, 0), this.d, this.f45042e, this.f45043f);
            default:
                f fVar2 = this.f45040b;
                return fVar2.f45051b.scheduleWithFixedDelay(new d(fVar2, this.f45041c, dVar, 2), this.d, this.f45042e, this.f45043f);
        }
    }
}
