package th;

import org.telegram.messenger.o20;
import org.telegram.ui.Components.fi0;
public final class q2 implements o20 {
    public final int f49396a;
    public final u2 f49397b;
    public final x2 f49398c;

    public q2(u2 u2Var, x2 x2Var, int i10) {
        this.f49396a = i10;
        this.f49397b = u2Var;
        this.f49398c = x2Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f49396a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                z2 z2Var = this.f49397b.f49526x;
                k2.t0 t0Var = z2Var.f49783v2;
                n7 n7Var = (n7) t0Var.f10769c;
                if (n7Var == null) {
                    ((f7) z2Var.f49797z1).g(false);
                    z2Var.setActive(true);
                    z2Var.D3 = false;
                    z2Var.R0 = new lg.b(3, runnable);
                    if (bool.booleanValue()) {
                        z2Var.d1(false);
                    }
                    org.telegram.messenger.i0.h3(runnable, 400L);
                    return;
                }
                n7Var.firstFrameRendered = false;
                t0Var.f10768b = false;
                n7Var.setOnReadyListener(new o1(1, currentTimeMillis, runnable));
                ((f7) z2Var.f49797z1).g(false);
                fi0 fi0Var = z2Var.f49731i0;
                if (fi0Var != null) {
                    fi0Var.setAnimation(this.f49398c.f49628u);
                }
                if (z2Var.A2 > 0 && l4.longValue() > z2Var.A2 - 1400) {
                    l4 = 0L;
                }
                z2Var.R0(l4.longValue(), true);
                z2Var.D3 = false;
                org.telegram.messenger.i0.h3(runnable, 400L);
                if (bool.booleanValue()) {
                    z2Var.d1(false);
                    return;
                }
                return;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l12 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                z2 z2Var2 = this.f49397b.f49526x;
                k2.t0 t0Var2 = z2Var2.f49783v2;
                n7 n7Var2 = (n7) t0Var2.f10769c;
                if (n7Var2 == null) {
                    ((f7) z2Var2.f49797z1).g(false);
                    z2Var2.setActive(true);
                    z2Var2.D3 = false;
                    z2Var2.R0 = new lg.b(4, runnable2);
                    if (bool2.booleanValue()) {
                        z2Var2.d1(false);
                    }
                    org.telegram.messenger.i0.h3(runnable2, 400L);
                    return;
                }
                n7Var2.firstFrameRendered = false;
                t0Var2.f10768b = false;
                n7Var2.setOnReadyListener(new o1(2, currentTimeMillis2, runnable2));
                ((f7) z2Var2.f49797z1).g(false);
                fi0 fi0Var2 = z2Var2.f49731i0;
                if (fi0Var2 != null) {
                    fi0Var2.setAnimation(this.f49398c.f49628u);
                }
                if (z2Var2.A2 > 0 && l11.longValue() > z2Var2.A2 - 1400) {
                    l11 = 0L;
                }
                z2Var2.R0(l11.longValue(), true);
                z2Var2.D3 = false;
                org.telegram.messenger.i0.h3(runnable2, 400L);
                if (bool2.booleanValue()) {
                    z2Var2.d1(false);
                    return;
                }
                return;
        }
    }
}
