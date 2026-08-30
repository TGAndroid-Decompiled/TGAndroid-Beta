package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class uo0 implements Utilities.Callback {
    public final int f38983a;
    public final vo0 f38984b;

    public uo0(vo0 vo0Var, int i10) {
        this.f38983a = i10;
        this.f38984b = vo0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        bp0 bp0Var;
        fp0 fp0Var;
        bp0 bp0Var2;
        switch (this.f38983a) {
            case 0:
                Integer num = (Integer) obj;
                vo0 vo0Var = this.f38984b;
                bp0 bp0Var3 = vo0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) bp0Var3.E.get(num);
                }
                bp0Var3.C = starGift;
                gp0 gp0Var = bp0Var3.f33007g0;
                if (starGift == null) {
                    kh.b5 b5Var = bp0Var3.B;
                    if (b5Var != null) {
                        b5Var.f();
                        bp0Var3.B = null;
                    }
                } else {
                    kh.b5 b5Var2 = bp0Var3.B;
                    if (b5Var2 == null || b5Var2.f10483b != starGift.f19409id) {
                        i10 = ((org.telegram.ui.ActionBar.p2) gp0Var).currentAccount;
                        kh.b5 b5Var3 = new kh.b5(bp0Var3.C.f19409id, i10, new uo0(vo0Var, 2));
                        bp0Var3.B = b5Var3;
                        b5Var3.g(false);
                    }
                }
                bp0Var3.e();
                if (gp0Var.f34662y.getCurrentPosition() == 1) {
                    bp0Var = gp0Var.h;
                } else {
                    bp0Var = gp0Var.f34656f;
                }
                bp0Var.e();
                return;
            case 1:
                bp0 bp0Var4 = this.f38984b.e;
                bp0Var4.f33008n = ((Integer) obj).intValue();
                bp0Var4.f33010s = null;
                bp0Var4.v = null;
                bp0Var4.f33013y = null;
                bp0Var4.i(true);
                bp0Var4.h();
                bp0Var4.f();
                ap0 ap0Var = bp0Var4.f33012x;
                if (ap0Var != null) {
                    ap0Var.invalidate();
                }
                gp0 gp0Var2 = bp0Var4.f33007g0;
                bp0 bp0Var5 = gp0Var2.h;
                if (bp0Var5 != null && (fp0Var = bp0Var5.f32997a) != null && (bp0Var2 = gp0Var2.f34656f) != null) {
                    fp0Var.a(bp0Var2.f33008n);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f38984b.e.e();
                return;
        }
    }
}
