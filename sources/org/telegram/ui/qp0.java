package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class qp0 implements Utilities.Callback {
    public final int f39203a;
    public final rp0 f39204b;

    public qp0(rp0 rp0Var, int i10) {
        this.f39203a = i10;
        this.f39204b = rp0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        yp0 yp0Var;
        cq0 cq0Var;
        yp0 yp0Var2;
        switch (this.f39203a) {
            case 0:
                Integer num = (Integer) obj;
                rp0 rp0Var = this.f39204b;
                yp0 yp0Var3 = rp0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) yp0Var3.M.get(num);
                }
                yp0Var3.K = starGift;
                eq0 eq0Var = yp0Var3.f41880p0;
                if (starGift == null) {
                    yh.t3 t3Var = yp0Var3.J;
                    if (t3Var != null) {
                        t3Var.f();
                        yp0Var3.J = null;
                    }
                } else {
                    yh.t3 t3Var2 = yp0Var3.J;
                    if (t3Var2 == null || t3Var2.f49129b != starGift.f19141id) {
                        i10 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                        yh.t3 t3Var3 = new yh.t3(yp0Var3.K.f19141id, i10, new qp0(rp0Var, 2));
                        yp0Var3.J = t3Var3;
                        t3Var3.g(false);
                    }
                }
                yp0.a(yp0Var3);
                if (eq0Var.I.getCurrentPosition() == 1) {
                    yp0Var = eq0Var.f35362n;
                } else {
                    yp0Var = eq0Var.h;
                }
                yp0Var.e();
                return;
            case 1:
                yp0 yp0Var4 = this.f39204b.e;
                yp0Var4.h = ((Integer) obj).intValue();
                yp0Var4.f41881r = null;
                yp0Var4.f41882s = null;
                yp0Var4.I = null;
                yp0Var4.j(true);
                yp0Var4.i();
                yp0Var4.f(true);
                xp0 xp0Var = yp0Var4.f41885y;
                if (xp0Var != null) {
                    xp0Var.invalidate();
                }
                eq0 eq0Var2 = yp0Var4.f41880p0;
                yp0 yp0Var5 = eq0Var2.f35362n;
                if (yp0Var5 != null && (cq0Var = yp0Var5.f41861a) != null && (yp0Var2 = eq0Var2.h) != null) {
                    cq0Var.a(yp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f39204b.e.e();
                return;
        }
    }
}
