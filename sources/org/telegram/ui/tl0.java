package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class tl0 implements org.telegram.messenger.c20 {
    public final int f50092a;
    public final ul0 f50093b;

    public tl0(ul0 ul0Var, int i7) {
        this.f50092a = i7;
        this.f50093b = ul0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i7;
        bm0 bm0Var;
        fm0 fm0Var;
        bm0 bm0Var2;
        switch (this.f50092a) {
            case 0:
                Integer num = (Integer) obj;
                ul0 ul0Var = this.f50093b;
                bm0 bm0Var3 = ul0Var.f50451e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) bm0Var3.M.get(num);
                }
                bm0Var3.K = starGift;
                hm0 hm0Var = bm0Var3.f44447p0;
                if (starGift == null) {
                    zh.d3 d3Var = bm0Var3.J;
                    if (d3Var != null) {
                        d3Var.f();
                        bm0Var3.J = null;
                    }
                } else {
                    zh.d3 d3Var2 = bm0Var3.J;
                    if (d3Var2 == null || d3Var2.f60174b != starGift.f27181id) {
                        i7 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                        zh.d3 d3Var3 = new zh.d3(i7, bm0Var3.K.f27181id, new tl0(ul0Var, 2));
                        bm0Var3.J = d3Var3;
                        d3Var3.g(false);
                    }
                }
                bm0.a(bm0Var3);
                if (hm0Var.I.getCurrentPosition() == 1) {
                    bm0Var = hm0Var.f46459n;
                } else {
                    bm0Var = hm0Var.h;
                }
                bm0Var.e();
                return;
            case 1:
                bm0 bm0Var4 = this.f50093b.f50451e;
                bm0Var4.h = ((Integer) obj).intValue();
                bm0Var4.f44448r = null;
                bm0Var4.f44449s = null;
                bm0Var4.I = null;
                bm0Var4.j(true);
                bm0Var4.i();
                bm0Var4.f(true);
                am0 am0Var = bm0Var4.D;
                if (am0Var != null) {
                    am0Var.invalidate();
                }
                hm0 hm0Var2 = bm0Var4.f44447p0;
                bm0 bm0Var5 = hm0Var2.f46459n;
                if (bm0Var5 != null && (fm0Var = bm0Var5.f44427a) != null && (bm0Var2 = hm0Var2.h) != null) {
                    fm0Var.a(bm0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f50093b.f50451e.e();
                return;
        }
    }
}
