package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class zo0 implements Utilities.Callback {
    public final int f40840a;
    public final ap0 f40841b;

    public zo0(ap0 ap0Var, int i10) {
        this.f40840a = i10;
        this.f40841b = ap0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        hp0 hp0Var;
        lp0 lp0Var;
        hp0 hp0Var2;
        switch (this.f40840a) {
            case 0:
                Integer num = (Integer) obj;
                ap0 ap0Var = this.f40841b;
                hp0 hp0Var3 = ap0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) hp0Var3.J.get(num);
                }
                hp0Var3.H = starGift;
                np0 np0Var = hp0Var3.m0;
                if (starGift == null) {
                    kh.a5 a5Var = hp0Var3.G;
                    if (a5Var != null) {
                        a5Var.f();
                        hp0Var3.G = null;
                    }
                } else {
                    kh.a5 a5Var2 = hp0Var3.G;
                    if (a5Var2 == null || a5Var2.f10581b != starGift.f19384id) {
                        i10 = ((org.telegram.ui.ActionBar.p2) np0Var).currentAccount;
                        kh.a5 a5Var3 = new kh.a5(hp0Var3.H.f19384id, i10, new zo0(ap0Var, 2));
                        hp0Var3.G = a5Var3;
                        a5Var3.g(false);
                    }
                }
                hp0.a(hp0Var3);
                if (np0Var.F.getCurrentPosition() == 1) {
                    hp0Var = np0Var.f36565n;
                } else {
                    hp0Var = np0Var.h;
                }
                hp0Var.e();
                return;
            case 1:
                hp0 hp0Var4 = this.f40841b.e;
                hp0Var4.h = ((Integer) obj).intValue();
                hp0Var4.f34735r = null;
                hp0Var4.f34736s = null;
                hp0Var4.F = null;
                hp0Var4.j(true);
                hp0Var4.i();
                hp0Var4.f(true);
                gp0 gp0Var = hp0Var4.f34739y;
                if (gp0Var != null) {
                    gp0Var.invalidate();
                }
                np0 np0Var2 = hp0Var4.m0;
                hp0 hp0Var5 = np0Var2.f36565n;
                if (hp0Var5 != null && (lp0Var = hp0Var5.f34718a) != null && (hp0Var2 = np0Var2.h) != null) {
                    lp0Var.a(hp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f40841b.e.e();
                return;
        }
    }
}
