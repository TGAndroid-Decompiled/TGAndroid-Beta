package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class vl0 implements org.telegram.messenger.z10 {
    public final int f52245a;
    public final wl0 f52246b;

    public vl0(wl0 wl0Var, int i7) {
        this.f52245a = i7;
        this.f52246b = wl0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i7;
        dm0 dm0Var;
        hm0 hm0Var;
        dm0 dm0Var2;
        switch (this.f52245a) {
            case 0:
                Integer num = (Integer) obj;
                wl0 wl0Var = this.f52246b;
                dm0 dm0Var3 = wl0Var.f52932e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) dm0Var3.N.get(num);
                }
                dm0Var3.L = starGift;
                jm0 jm0Var = dm0Var3.f46419q0;
                if (starGift == null) {
                    bi.o5 o5Var = dm0Var3.K;
                    if (o5Var != null) {
                        o5Var.f();
                        dm0Var3.K = null;
                    }
                } else {
                    bi.o5 o5Var2 = dm0Var3.K;
                    if (o5Var2 == null || o5Var2.f3758b != starGift.f28280id) {
                        i7 = ((org.telegram.ui.ActionBar.e2) jm0Var).currentAccount;
                        bi.o5 o5Var3 = new bi.o5(i7, dm0Var3.L.f28280id, new vl0(wl0Var, 2));
                        dm0Var3.K = o5Var3;
                        o5Var3.g(false);
                    }
                }
                dm0.a(dm0Var3);
                if (jm0Var.J.getCurrentPosition() == 1) {
                    dm0Var = jm0Var.f48378n;
                } else {
                    dm0Var = jm0Var.h;
                }
                dm0Var.e();
                return;
            case 1:
                dm0 dm0Var4 = this.f52246b.f52932e;
                dm0Var4.h = ((Integer) obj).intValue();
                dm0Var4.f46420r = null;
                dm0Var4.f46421s = null;
                dm0Var4.J = null;
                dm0Var4.j(true);
                dm0Var4.i();
                dm0Var4.f(true);
                cm0 cm0Var = dm0Var4.E;
                if (cm0Var != null) {
                    cm0Var.invalidate();
                }
                jm0 jm0Var2 = dm0Var4.f46419q0;
                dm0 dm0Var5 = jm0Var2.f48378n;
                if (dm0Var5 != null && (hm0Var = dm0Var5.f46398a) != null && (dm0Var2 = jm0Var2.h) != null) {
                    hm0Var.a(dm0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f52246b.f52932e.e();
                return;
        }
    }
}
