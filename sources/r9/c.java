package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f42426a;
    public final f f42427b;
    public final Runnable f42428c;
    public final long d;
    public final long e;
    public final TimeUnit f42429f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42426a = i10;
        this.f42427b = fVar;
        this.f42428c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42429f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(n2.e eVar) {
        switch (this.f42426a) {
            case 0:
                f fVar = this.f42427b;
                return fVar.f42437b.scheduleAtFixedRate(new d(fVar, this.f42428c, eVar, 0), this.d, this.e, this.f42429f);
            default:
                f fVar2 = this.f42427b;
                return fVar2.f42437b.scheduleWithFixedDelay(new d(fVar2, this.f42428c, eVar, 2), this.d, this.e, this.f42429f);
        }
    }
}
