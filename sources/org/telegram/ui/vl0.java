package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class vl0 implements org.telegram.messenger.w10 {
    public final int f52982a;
    public final wl0 f52983b;

    public vl0(wl0 wl0Var, int i7) {
        this.f52982a = i7;
        this.f52983b = wl0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i7;
        dm0 dm0Var;
        hm0 hm0Var;
        dm0 dm0Var2;
        switch (this.f52982a) {
            case 0:
                Integer num = (Integer) obj;
                wl0 wl0Var = this.f52983b;
                dm0 dm0Var3 = wl0Var.f53702e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) dm0Var3.N.get(num);
                }
                dm0Var3.L = starGift;
                jm0 jm0Var = dm0Var3.f47185q0;
                if (starGift == null) {
                    bi.a8 a8Var = dm0Var3.K;
                    if (a8Var != null) {
                        a8Var.i();
                        dm0Var3.K = null;
                    }
                } else {
                    bi.a8 a8Var2 = dm0Var3.K;
                    if (a8Var2 == null || a8Var2.f3362b != starGift.f28721id) {
                        i7 = ((org.telegram.ui.ActionBar.g2) jm0Var).currentAccount;
                        bi.a8 a8Var3 = new bi.a8(i7, dm0Var3.L.f28721id, new vl0(wl0Var, 2));
                        a8Var3.f3380w = true;
                        dm0Var3.K = a8Var3;
                        a8Var3.l(false);
                    }
                }
                dm0.a(dm0Var3);
                if (jm0Var.J.getCurrentPosition() == 1) {
                    dm0Var = jm0Var.f49164n;
                } else {
                    dm0Var = jm0Var.h;
                }
                dm0Var.e();
                return;
            case 1:
                dm0 dm0Var4 = this.f52983b.f53702e;
                dm0Var4.h = ((Integer) obj).intValue();
                dm0Var4.f47186r = null;
                dm0Var4.f47187s = null;
                dm0Var4.J = null;
                dm0Var4.j(true);
                dm0Var4.i();
                dm0Var4.f(true);
                cm0 cm0Var = dm0Var4.E;
                if (cm0Var != null) {
                    cm0Var.invalidate();
                }
                jm0 jm0Var2 = dm0Var4.f47185q0;
                dm0 dm0Var5 = jm0Var2.f49164n;
                if (dm0Var5 != null && (hm0Var = dm0Var5.f47164a) != null && (dm0Var2 = jm0Var2.h) != null) {
                    hm0Var.a(dm0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f52983b.f53702e.e();
                return;
        }
    }
}
