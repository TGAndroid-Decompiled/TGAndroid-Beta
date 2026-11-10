package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class wl0 implements org.telegram.messenger.c20 {
    public final int f51392a;
    public final xl0 f51393b;

    public wl0(xl0 xl0Var, int i7) {
        this.f51392a = i7;
        this.f51393b = xl0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i7;
        em0 em0Var;
        im0 im0Var;
        em0 em0Var2;
        switch (this.f51392a) {
            case 0:
                Integer num = (Integer) obj;
                xl0 xl0Var = this.f51393b;
                em0 em0Var3 = xl0Var.f51746e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) em0Var3.M.get(num);
                }
                em0Var3.K = starGift;
                km0 km0Var = em0Var3.f45401p0;
                if (starGift == null) {
                    zh.c3 c3Var = em0Var3.J;
                    if (c3Var != null) {
                        c3Var.f();
                        em0Var3.J = null;
                    }
                } else {
                    zh.c3 c3Var2 = em0Var3.J;
                    if (c3Var2 == null || c3Var2.f60264b != starGift.f27189id) {
                        i7 = ((org.telegram.ui.ActionBar.f2) km0Var).currentAccount;
                        zh.c3 c3Var3 = new zh.c3(i7, em0Var3.K.f27189id, new wl0(xl0Var, 2));
                        em0Var3.J = c3Var3;
                        c3Var3.g(false);
                    }
                }
                em0.a(em0Var3);
                if (km0Var.I.getCurrentPosition() == 1) {
                    em0Var = km0Var.f47376n;
                } else {
                    em0Var = km0Var.h;
                }
                em0Var.e();
                return;
            case 1:
                em0 em0Var4 = this.f51393b.f51746e;
                em0Var4.h = ((Integer) obj).intValue();
                em0Var4.f45402r = null;
                em0Var4.f45403s = null;
                em0Var4.I = null;
                em0Var4.j(true);
                em0Var4.i();
                em0Var4.f(true);
                dm0 dm0Var = em0Var4.D;
                if (dm0Var != null) {
                    dm0Var.invalidate();
                }
                km0 km0Var2 = em0Var4.f45401p0;
                em0 em0Var5 = km0Var2.f47376n;
                if (em0Var5 != null && (im0Var = em0Var5.f45381a) != null && (em0Var2 = km0Var2.h) != null) {
                    im0Var.a(em0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f51393b.f51746e.e();
                return;
        }
    }
}
