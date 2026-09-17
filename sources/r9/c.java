package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f45067a;
    public final f f45068b;
    public final Runnable f45069c;
    public final long d;
    public final long f45070e;
    public final TimeUnit f45071f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f45067a = i10;
        this.f45068b = fVar;
        this.f45069c = runnable;
        this.d = j3;
        this.f45070e = j10;
        this.f45071f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(l.d dVar) {
        switch (this.f45067a) {
            case 0:
                f fVar = this.f45068b;
                return fVar.f45079b.scheduleAtFixedRate(new d(fVar, this.f45069c, dVar, 0), this.d, this.f45070e, this.f45071f);
            default:
                f fVar2 = this.f45068b;
                return fVar2.f45079b.scheduleWithFixedDelay(new d(fVar2, this.f45069c, dVar, 2), this.d, this.f45070e, this.f45071f);
        }
    }
}
