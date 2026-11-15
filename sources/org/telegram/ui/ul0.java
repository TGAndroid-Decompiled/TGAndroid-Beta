package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class ul0 implements org.telegram.messenger.z10 {
    public final int f51966a;
    public final vl0 f51967b;

    public ul0(vl0 vl0Var, int i7) {
        this.f51966a = i7;
        this.f51967b = vl0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i7;
        cm0 cm0Var;
        gm0 gm0Var;
        cm0 cm0Var2;
        switch (this.f51966a) {
            case 0:
                Integer num = (Integer) obj;
                vl0 vl0Var = this.f51967b;
                cm0 cm0Var3 = vl0Var.f52247e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) cm0Var3.N.get(num);
                }
                cm0Var3.L = starGift;
                im0 im0Var = cm0Var3.f46210q0;
                if (starGift == null) {
                    bi.o5 o5Var = cm0Var3.K;
                    if (o5Var != null) {
                        o5Var.f();
                        cm0Var3.K = null;
                    }
                } else {
                    bi.o5 o5Var2 = cm0Var3.K;
                    if (o5Var2 == null || o5Var2.f3755b != starGift.f28280id) {
                        i7 = ((org.telegram.ui.ActionBar.e2) im0Var).currentAccount;
                        bi.o5 o5Var3 = new bi.o5(i7, cm0Var3.L.f28280id, new ul0(vl0Var, 2));
                        cm0Var3.K = o5Var3;
                        o5Var3.g(false);
                    }
                }
                cm0.a(cm0Var3);
                if (im0Var.J.getCurrentPosition() == 1) {
                    cm0Var = im0Var.f48094n;
                } else {
                    cm0Var = im0Var.h;
                }
                cm0Var.e();
                return;
            case 1:
                cm0 cm0Var4 = this.f51967b.f52247e;
                cm0Var4.h = ((Integer) obj).intValue();
                cm0Var4.f46211r = null;
                cm0Var4.f46212s = null;
                cm0Var4.J = null;
                cm0Var4.j(true);
                cm0Var4.i();
                cm0Var4.f(true);
                bm0 bm0Var = cm0Var4.E;
                if (bm0Var != null) {
                    bm0Var.invalidate();
                }
                im0 im0Var2 = cm0Var4.f46210q0;
                cm0 cm0Var5 = im0Var2.f48094n;
                if (cm0Var5 != null && (gm0Var = cm0Var5.f46189a) != null && (cm0Var2 = im0Var2.h) != null) {
                    gm0Var.a(cm0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f51967b.f52247e.e();
                return;
        }
    }
}
