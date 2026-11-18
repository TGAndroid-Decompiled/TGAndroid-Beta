package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class xl0 implements org.telegram.messenger.x10 {
    public final int f53848a;
    public final yl0 f53849b;

    public xl0(yl0 yl0Var, int i7) {
        this.f53848a = i7;
        this.f53849b = yl0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i7;
        fm0 fm0Var;
        jm0 jm0Var;
        fm0 fm0Var2;
        switch (this.f53848a) {
            case 0:
                Integer num = (Integer) obj;
                yl0 yl0Var = this.f53849b;
                fm0 fm0Var3 = yl0Var.f54184e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) fm0Var3.N.get(num);
                }
                fm0Var3.L = starGift;
                lm0 lm0Var = fm0Var3.f47715q0;
                if (starGift == null) {
                    bi.u7 u7Var = fm0Var3.K;
                    if (u7Var != null) {
                        u7Var.i();
                        fm0Var3.K = null;
                    }
                } else {
                    bi.u7 u7Var2 = fm0Var3.K;
                    if (u7Var2 == null || u7Var2.f4088b != starGift.f28632id) {
                        i7 = ((org.telegram.ui.ActionBar.h2) lm0Var).currentAccount;
                        bi.u7 u7Var3 = new bi.u7(i7, fm0Var3.L.f28632id, new xl0(yl0Var, 2));
                        u7Var3.f4106w = true;
                        fm0Var3.K = u7Var3;
                        u7Var3.l(false);
                    }
                }
                fm0.a(fm0Var3);
                if (lm0Var.J.getCurrentPosition() == 1) {
                    fm0Var = lm0Var.f49601n;
                } else {
                    fm0Var = lm0Var.h;
                }
                fm0Var.e();
                return;
            case 1:
                fm0 fm0Var4 = this.f53849b.f54184e;
                fm0Var4.h = ((Integer) obj).intValue();
                fm0Var4.f47716r = null;
                fm0Var4.f47717s = null;
                fm0Var4.J = null;
                fm0Var4.j(true);
                fm0Var4.i();
                fm0Var4.f(true);
                em0 em0Var = fm0Var4.E;
                if (em0Var != null) {
                    em0Var.invalidate();
                }
                lm0 lm0Var2 = fm0Var4.f47715q0;
                fm0 fm0Var5 = lm0Var2.f49601n;
                if (fm0Var5 != null && (jm0Var = fm0Var5.f47694a) != null && (fm0Var2 = lm0Var2.h) != null) {
                    jm0Var.a(fm0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f53849b.f54184e.e();
                return;
        }
    }
}
