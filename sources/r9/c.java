package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f45953a;
    public final f f45954b;
    public final Runnable f45955c;
    public final long d;
    public final long f45956e;
    public final TimeUnit f45957f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f45953a = i10;
        this.f45954b = fVar;
        this.f45955c = runnable;
        this.d = j3;
        this.f45956e = j10;
        this.f45957f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(k2.e eVar) {
        switch (this.f45953a) {
            case 0:
                f fVar = this.f45954b;
                return fVar.f45965b.scheduleAtFixedRate(new d(fVar, this.f45955c, eVar, 0), this.d, this.f45956e, this.f45957f);
            default:
                f fVar2 = this.f45954b;
                return fVar2.f45965b.scheduleWithFixedDelay(new d(fVar2, this.f45955c, eVar, 2), this.d, this.f45956e, this.f45957f);
        }
    }
}
