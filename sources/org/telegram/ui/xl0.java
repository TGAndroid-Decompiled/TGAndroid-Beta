package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class xl0 implements org.telegram.messenger.y10 {
    public final int f53823a;
    public final yl0 f53824b;

    public xl0(yl0 yl0Var, int i7) {
        this.f53823a = i7;
        this.f53824b = yl0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i7;
        fm0 fm0Var;
        jm0 jm0Var;
        fm0 fm0Var2;
        switch (this.f53823a) {
            case 0:
                Integer num = (Integer) obj;
                yl0 yl0Var = this.f53824b;
                fm0 fm0Var3 = yl0Var.f54204e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) fm0Var3.N.get(num);
                }
                fm0Var3.L = starGift;
                lm0 lm0Var = fm0Var3.f47754q0;
                if (starGift == null) {
                    bi.a8 a8Var = fm0Var3.K;
                    if (a8Var != null) {
                        a8Var.i();
                        fm0Var3.K = null;
                    }
                } else {
                    bi.a8 a8Var2 = fm0Var3.K;
                    if (a8Var2 == null || a8Var2.f3362b != starGift.f28627id) {
                        i7 = ((org.telegram.ui.ActionBar.g2) lm0Var).currentAccount;
                        bi.a8 a8Var3 = new bi.a8(i7, fm0Var3.L.f28627id, new xl0(yl0Var, 2));
                        a8Var3.f3380w = true;
                        fm0Var3.K = a8Var3;
                        a8Var3.l(false);
                    }
                }
                fm0.a(fm0Var3);
                if (lm0Var.J.getCurrentPosition() == 1) {
                    fm0Var = lm0Var.f49633n;
                } else {
                    fm0Var = lm0Var.h;
                }
                fm0Var.e();
                return;
            case 1:
                fm0 fm0Var4 = this.f53824b.f54204e;
                fm0Var4.h = ((Integer) obj).intValue();
                fm0Var4.f47755r = null;
                fm0Var4.f47756s = null;
                fm0Var4.J = null;
                fm0Var4.j(true);
                fm0Var4.i();
                fm0Var4.f(true);
                em0 em0Var = fm0Var4.E;
                if (em0Var != null) {
                    em0Var.invalidate();
                }
                lm0 lm0Var2 = fm0Var4.f47754q0;
                fm0 fm0Var5 = lm0Var2.f49633n;
                if (fm0Var5 != null && (jm0Var = fm0Var5.f47733a) != null && (fm0Var2 = lm0Var2.h) != null) {
                    jm0Var.a(fm0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f53824b.f54204e.e();
                return;
        }
    }
}
