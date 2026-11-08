package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class tl0 implements org.telegram.messenger.c20 {
    public final int f50083a;
    public final ul0 f50084b;

    public tl0(ul0 ul0Var, int i7) {
        this.f50083a = i7;
        this.f50084b = ul0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i7;
        bm0 bm0Var;
        fm0 fm0Var;
        bm0 bm0Var2;
        switch (this.f50083a) {
            case 0:
                Integer num = (Integer) obj;
                ul0 ul0Var = this.f50084b;
                bm0 bm0Var3 = ul0Var.f50373e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) bm0Var3.M.get(num);
                }
                bm0Var3.K = starGift;
                hm0 hm0Var = bm0Var3.f44449p0;
                if (starGift == null) {
                    zh.b3 b3Var = bm0Var3.J;
                    if (b3Var != null) {
                        b3Var.f();
                        bm0Var3.J = null;
                    }
                } else {
                    zh.b3 b3Var2 = bm0Var3.J;
                    if (b3Var2 == null || b3Var2.f60235b != starGift.f27185id) {
                        i7 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                        zh.b3 b3Var3 = new zh.b3(i7, bm0Var3.K.f27185id, new tl0(ul0Var, 2));
                        bm0Var3.J = b3Var3;
                        b3Var3.g(false);
                    }
                }
                bm0.a(bm0Var3);
                if (hm0Var.I.getCurrentPosition() == 1) {
                    bm0Var = hm0Var.f46457n;
                } else {
                    bm0Var = hm0Var.h;
                }
                bm0Var.e();
                return;
            case 1:
                bm0 bm0Var4 = this.f50084b.f50373e;
                bm0Var4.h = ((Integer) obj).intValue();
                bm0Var4.f44450r = null;
                bm0Var4.f44451s = null;
                bm0Var4.I = null;
                bm0Var4.j(true);
                bm0Var4.i();
                bm0Var4.f(true);
                am0 am0Var = bm0Var4.D;
                if (am0Var != null) {
                    am0Var.invalidate();
                }
                hm0 hm0Var2 = bm0Var4.f44449p0;
                bm0 bm0Var5 = hm0Var2.f46457n;
                if (bm0Var5 != null && (fm0Var = bm0Var5.f44429a) != null && (bm0Var2 = hm0Var2.h) != null) {
                    fm0Var.a(bm0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f50084b.f50373e.e();
                return;
        }
    }
}
