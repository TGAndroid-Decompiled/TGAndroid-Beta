package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class sp0 implements Utilities.Callback {
    public final int f40190a;
    public final tp0 f40191b;

    public sp0(tp0 tp0Var, int i10) {
        this.f40190a = i10;
        this.f40191b = tp0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        aq0 aq0Var;
        eq0 eq0Var;
        aq0 aq0Var2;
        switch (this.f40190a) {
            case 0:
                Integer num = (Integer) obj;
                tp0 tp0Var = this.f40191b;
                aq0 aq0Var3 = tp0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) aq0Var3.M.get(num);
                }
                aq0Var3.K = starGift;
                gq0 gq0Var = aq0Var3.f34322p0;
                if (starGift == null) {
                    yh.t3 t3Var = aq0Var3.J;
                    if (t3Var != null) {
                        t3Var.f();
                        aq0Var3.J = null;
                    }
                } else {
                    yh.t3 t3Var2 = aq0Var3.J;
                    if (t3Var2 == null || t3Var2.f49130b != starGift.f19441id) {
                        i10 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
                        yh.t3 t3Var3 = new yh.t3(aq0Var3.K.f19441id, i10, new sp0(tp0Var, 2));
                        aq0Var3.J = t3Var3;
                        t3Var3.g(false);
                    }
                }
                aq0.a(aq0Var3);
                if (gq0Var.I.getCurrentPosition() == 1) {
                    aq0Var = gq0Var.f36463n;
                } else {
                    aq0Var = gq0Var.h;
                }
                aq0Var.e();
                return;
            case 1:
                aq0 aq0Var4 = this.f40191b.e;
                aq0Var4.h = ((Integer) obj).intValue();
                aq0Var4.f34323r = null;
                aq0Var4.f34324s = null;
                aq0Var4.I = null;
                aq0Var4.j(true);
                aq0Var4.i();
                aq0Var4.f(true);
                zp0 zp0Var = aq0Var4.f34327y;
                if (zp0Var != null) {
                    zp0Var.invalidate();
                }
                gq0 gq0Var2 = aq0Var4.f34322p0;
                aq0 aq0Var5 = gq0Var2.f36463n;
                if (aq0Var5 != null && (eq0Var = aq0Var5.f34303a) != null && (aq0Var2 = gq0Var2.h) != null) {
                    eq0Var.a(aq0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f40191b.e.e();
                return;
        }
    }
}
