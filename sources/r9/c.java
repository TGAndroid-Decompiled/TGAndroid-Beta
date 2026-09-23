package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k2.u;
public final class c implements g {
    public final int f42107a;
    public final f f42108b;
    public final Runnable f42109c;
    public final long d;
    public final long e;
    public final TimeUnit f42110f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42107a = i10;
        this.f42108b = fVar;
        this.f42109c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42110f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(u uVar) {
        switch (this.f42107a) {
            case 0:
                f fVar = this.f42108b;
                return fVar.f42118b.scheduleAtFixedRate(new d(fVar, this.f42109c, uVar, 0), this.d, this.e, this.f42110f);
            default:
                f fVar2 = this.f42108b;
                return fVar2.f42118b.scheduleWithFixedDelay(new d(fVar2, this.f42109c, uVar, 2), this.d, this.e, this.f42110f);
        }
    }
}
