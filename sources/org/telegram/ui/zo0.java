package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class zo0 implements Utilities.Callback {
    public final int f43993a;
    public final ap0 f43994b;

    public zo0(ap0 ap0Var, int i10) {
        this.f43993a = i10;
        this.f43994b = ap0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        hp0 hp0Var;
        lp0 lp0Var;
        hp0 hp0Var2;
        switch (this.f43993a) {
            case 0:
                Integer num = (Integer) obj;
                ap0 ap0Var = this.f43994b;
                hp0 hp0Var3 = ap0Var.f35234e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) hp0Var3.J.get(num);
                }
                hp0Var3.H = starGift;
                np0 np0Var = hp0Var3.m0;
                if (starGift == null) {
                    lh.b5 b5Var = hp0Var3.G;
                    if (b5Var != null) {
                        b5Var.f();
                        hp0Var3.G = null;
                    }
                } else {
                    lh.b5 b5Var2 = hp0Var3.G;
                    if (b5Var2 == null || b5Var2.f12621b != starGift.f21072id) {
                        i10 = ((org.telegram.ui.ActionBar.p2) np0Var).currentAccount;
                        lh.b5 b5Var3 = new lh.b5(hp0Var3.H.f21072id, i10, new zo0(ap0Var, 2));
                        hp0Var3.G = b5Var3;
                        b5Var3.g(false);
                    }
                }
                hp0.a(hp0Var3);
                if (np0Var.F.getCurrentPosition() == 1) {
                    hp0Var = np0Var.f39435n;
                } else {
                    hp0Var = np0Var.h;
                }
                hp0Var.e();
                return;
            case 1:
                hp0 hp0Var4 = this.f43994b.f35234e;
                hp0Var4.h = ((Integer) obj).intValue();
                hp0Var4.f37459r = null;
                hp0Var4.f37460s = null;
                hp0Var4.F = null;
                hp0Var4.j(true);
                hp0Var4.i();
                hp0Var4.f(true);
                gp0 gp0Var = hp0Var4.f37463y;
                if (gp0Var != null) {
                    gp0Var.invalidate();
                }
                np0 np0Var2 = hp0Var4.m0;
                hp0 hp0Var5 = np0Var2.f39435n;
                if (hp0Var5 != null && (lp0Var = hp0Var5.f37441a) != null && (hp0Var2 = np0Var2.h) != null) {
                    lp0Var.a(hp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f43994b.f35234e.e();
                return;
        }
    }
}
