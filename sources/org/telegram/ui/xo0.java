package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class xo0 implements Utilities.Callback {
    public final int f43629a;
    public final yo0 f43630b;

    public xo0(yo0 yo0Var, int i10) {
        this.f43629a = i10;
        this.f43630b = yo0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        fp0 fp0Var;
        jp0 jp0Var;
        fp0 fp0Var2;
        switch (this.f43629a) {
            case 0:
                Integer num = (Integer) obj;
                yo0 yo0Var = this.f43630b;
                fp0 fp0Var3 = yo0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) fp0Var3.M.get(num);
                }
                fp0Var3.K = starGift;
                lp0 lp0Var = fp0Var3.f37402p0;
                if (starGift == null) {
                    yh.s3 s3Var = fp0Var3.J;
                    if (s3Var != null) {
                        s3Var.f();
                        fp0Var3.J = null;
                    }
                } else {
                    yh.s3 s3Var2 = fp0Var3.J;
                    if (s3Var2 == null || s3Var2.f50967b != starGift.f20567id) {
                        i10 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
                        yh.s3 s3Var3 = new yh.s3(fp0Var3.K.f20567id, i10, new xo0(yo0Var, 2));
                        fp0Var3.J = s3Var3;
                        s3Var3.g(false);
                    }
                }
                fp0.a(fp0Var3);
                if (lp0Var.I.getCurrentPosition() == 1) {
                    fp0Var = lp0Var.f39305n;
                } else {
                    fp0Var = lp0Var.h;
                }
                fp0Var.e();
                return;
            case 1:
                fp0 fp0Var4 = this.f43630b.e;
                fp0Var4.h = ((Integer) obj).intValue();
                fp0Var4.f37403r = null;
                fp0Var4.f37404s = null;
                fp0Var4.I = null;
                fp0Var4.j(true);
                fp0Var4.i();
                fp0Var4.f(true);
                ep0 ep0Var = fp0Var4.f37407y;
                if (ep0Var != null) {
                    ep0Var.invalidate();
                }
                lp0 lp0Var2 = fp0Var4.f37402p0;
                fp0 fp0Var5 = lp0Var2.f39305n;
                if (fp0Var5 != null && (jp0Var = fp0Var5.f37383a) != null && (fp0Var2 = lp0Var2.h) != null) {
                    jp0Var.a(fp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f43630b.e.e();
                return;
        }
    }
}
