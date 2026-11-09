package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class vl0 implements org.telegram.messenger.c20 {
    public final int f50716a;
    public final wl0 f50717b;

    public vl0(wl0 wl0Var, int i7) {
        this.f50716a = i7;
        this.f50717b = wl0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i7;
        dm0 dm0Var;
        hm0 hm0Var;
        dm0 dm0Var2;
        switch (this.f50716a) {
            case 0:
                Integer num = (Integer) obj;
                wl0 wl0Var = this.f50717b;
                dm0 dm0Var3 = wl0Var.f51429e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) dm0Var3.M.get(num);
                }
                dm0Var3.K = starGift;
                jm0 jm0Var = dm0Var3.f45078p0;
                if (starGift == null) {
                    zh.c3 c3Var = dm0Var3.J;
                    if (c3Var != null) {
                        c3Var.f();
                        dm0Var3.J = null;
                    }
                } else {
                    zh.c3 c3Var2 = dm0Var3.J;
                    if (c3Var2 == null || c3Var2.f60262b != starGift.f27185id) {
                        i7 = ((org.telegram.ui.ActionBar.f2) jm0Var).currentAccount;
                        zh.c3 c3Var3 = new zh.c3(i7, dm0Var3.K.f27185id, new vl0(wl0Var, 2));
                        dm0Var3.J = c3Var3;
                        c3Var3.g(false);
                    }
                }
                dm0.a(dm0Var3);
                if (jm0Var.I.getCurrentPosition() == 1) {
                    dm0Var = jm0Var.f47045n;
                } else {
                    dm0Var = jm0Var.h;
                }
                dm0Var.e();
                return;
            case 1:
                dm0 dm0Var4 = this.f50717b.f51429e;
                dm0Var4.h = ((Integer) obj).intValue();
                dm0Var4.f45079r = null;
                dm0Var4.f45080s = null;
                dm0Var4.I = null;
                dm0Var4.j(true);
                dm0Var4.i();
                dm0Var4.f(true);
                cm0 cm0Var = dm0Var4.D;
                if (cm0Var != null) {
                    cm0Var.invalidate();
                }
                jm0 jm0Var2 = dm0Var4.f45078p0;
                dm0 dm0Var5 = jm0Var2.f47045n;
                if (dm0Var5 != null && (hm0Var = dm0Var5.f45058a) != null && (dm0Var2 = jm0Var2.h) != null) {
                    hm0Var.a(dm0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f50717b.f51429e.e();
                return;
        }
    }
}
