package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class xl0 implements org.telegram.messenger.y10 {
    public final int f53901a;
    public final yl0 f53902b;

    public xl0(yl0 yl0Var, int i7) {
        this.f53901a = i7;
        this.f53902b = yl0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i7;
        fm0 fm0Var;
        jm0 jm0Var;
        fm0 fm0Var2;
        switch (this.f53901a) {
            case 0:
                Integer num = (Integer) obj;
                yl0 yl0Var = this.f53902b;
                fm0 fm0Var3 = yl0Var.f54230e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) fm0Var3.N.get(num);
                }
                fm0Var3.L = starGift;
                lm0 lm0Var = fm0Var3.f47786q0;
                if (starGift == null) {
                    bi.x7 x7Var = fm0Var3.K;
                    if (x7Var != null) {
                        x7Var.i();
                        fm0Var3.K = null;
                    }
                } else {
                    bi.x7 x7Var2 = fm0Var3.K;
                    if (x7Var2 == null || x7Var2.f4255b != starGift.f28663id) {
                        i7 = ((org.telegram.ui.ActionBar.g2) lm0Var).currentAccount;
                        bi.x7 x7Var3 = new bi.x7(i7, fm0Var3.L.f28663id, new xl0(yl0Var, 2));
                        x7Var3.f4273w = true;
                        fm0Var3.K = x7Var3;
                        x7Var3.l(false);
                    }
                }
                fm0.a(fm0Var3);
                if (lm0Var.J.getCurrentPosition() == 1) {
                    fm0Var = lm0Var.f49656n;
                } else {
                    fm0Var = lm0Var.h;
                }
                fm0Var.e();
                return;
            case 1:
                fm0 fm0Var4 = this.f53902b.f54230e;
                fm0Var4.h = ((Integer) obj).intValue();
                fm0Var4.f47787r = null;
                fm0Var4.f47788s = null;
                fm0Var4.J = null;
                fm0Var4.j(true);
                fm0Var4.i();
                fm0Var4.f(true);
                em0 em0Var = fm0Var4.E;
                if (em0Var != null) {
                    em0Var.invalidate();
                }
                lm0 lm0Var2 = fm0Var4.f47786q0;
                fm0 fm0Var5 = lm0Var2.f49656n;
                if (fm0Var5 != null && (jm0Var = fm0Var5.f47765a) != null && (fm0Var2 = lm0Var2.h) != null) {
                    jm0Var.a(fm0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f53902b.f54230e.e();
                return;
        }
    }
}
