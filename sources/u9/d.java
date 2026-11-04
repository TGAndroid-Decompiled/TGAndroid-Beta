package u9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.i9;
public final class d implements h {
    public final int f55753a;
    public final g f55754b;
    public final Runnable f55755c;
    public final long d;
    public final long f55756e;
    public final TimeUnit f55757f;

    public d(g gVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i3) {
        this.f55753a = i3;
        this.f55754b = gVar;
        this.f55755c = runnable;
        this.d = j10;
        this.f55756e = j11;
        this.f55757f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(i9 i9Var) {
        switch (this.f55753a) {
            case 0:
                g gVar = this.f55754b;
                return gVar.f55765b.scheduleAtFixedRate(new e(gVar, this.f55755c, i9Var, 0), this.d, this.f55756e, this.f55757f);
            default:
                g gVar2 = this.f55754b;
                return gVar2.f55765b.scheduleWithFixedDelay(new e(gVar2, this.f55755c, i9Var, 2), this.d, this.f55756e, this.f55757f);
        }
    }
}
