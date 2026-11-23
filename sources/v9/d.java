package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.nd0;
public final class d implements h {
    public final int f59439a;
    public final g f59440b;
    public final Runnable f59441c;
    public final long d;
    public final long f59442e;
    public final TimeUnit f59443f;

    public d(g gVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f59439a = i7;
        this.f59440b = gVar;
        this.f59441c = runnable;
        this.d = j3;
        this.f59442e = j10;
        this.f59443f = timeUnit;
    }

    @Override
    public final ScheduledFuture c(nd0 nd0Var) {
        switch (this.f59439a) {
            case 0:
                g gVar = this.f59440b;
                return gVar.f59451b.scheduleAtFixedRate(new e(gVar, this.f59441c, nd0Var, 0), this.d, this.f59442e, this.f59443f);
            default:
                g gVar2 = this.f59440b;
                return gVar2.f59451b.scheduleWithFixedDelay(new e(gVar2, this.f59441c, nd0Var, 2), this.d, this.f59442e, this.f59443f);
        }
    }
}
