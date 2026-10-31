package th;

import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.tl.TL_stories;
public final class l1 implements q20 {
    public final int f49163a;
    public final z2 f49164b;

    public l1(z2 z2Var, int i10) {
        this.f49163a = i10;
        this.f49164b = z2Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49163a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                z2 z2Var = this.f49164b;
                if (tL_premium_boostsStatus == null) {
                    o7 o7Var = z2Var.f49755s0;
                    if (o7Var != null) {
                        o7Var.f49315k1 = false;
                        o7Var.d0();
                        return;
                    }
                    return;
                }
                z2Var.f49758s3 = tL_premium_boostsStatus;
                vp.r1(z2Var.f49730l2).G0().b(z2Var.f49726k1, tL_premium_boostsStatus, new rh.e3(2, z2Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                z2 z2Var2 = this.f49164b;
                z2Var2.f49766u3 = longValue;
                t1 t1Var = z2Var2.K1;
                if (t1Var != null) {
                    t1Var.F(true);
                    z2Var2.K1.Q1();
                }
                z2Var2.p0(true);
                return;
        }
    }
}
