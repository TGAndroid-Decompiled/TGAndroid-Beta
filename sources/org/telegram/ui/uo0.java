package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class uo0 implements Utilities.Callback {
    public final int f42018a;
    public final vo0 f42019b;

    public uo0(vo0 vo0Var, int i10) {
        this.f42018a = i10;
        this.f42019b = vo0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        cp0 cp0Var;
        gp0 gp0Var;
        cp0 cp0Var2;
        switch (this.f42018a) {
            case 0:
                Integer num = (Integer) obj;
                vo0 vo0Var = this.f42019b;
                cp0 cp0Var3 = vo0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) cp0Var3.M.get(num);
                }
                cp0Var3.K = starGift;
                ip0 ip0Var = cp0Var3.f36059p0;
                if (starGift == null) {
                    yh.s3 s3Var = cp0Var3.J;
                    if (s3Var != null) {
                        s3Var.f();
                        cp0Var3.J = null;
                    }
                } else {
                    yh.s3 s3Var2 = cp0Var3.J;
                    if (s3Var2 == null || s3Var2.f50498b != starGift.f20499id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) ip0Var).currentAccount;
                        yh.s3 s3Var3 = new yh.s3(cp0Var3.K.f20499id, i10, new uo0(vo0Var, 2));
                        cp0Var3.J = s3Var3;
                        s3Var3.g(false);
                    }
                }
                cp0.a(cp0Var3);
                if (ip0Var.I.getCurrentPosition() == 1) {
                    cp0Var = ip0Var.f38086n;
                } else {
                    cp0Var = ip0Var.h;
                }
                cp0Var.e();
                return;
            case 1:
                cp0 cp0Var4 = this.f42019b.e;
                cp0Var4.h = ((Integer) obj).intValue();
                cp0Var4.f36060r = null;
                cp0Var4.f36061s = null;
                cp0Var4.I = null;
                cp0Var4.j(true);
                cp0Var4.i();
                cp0Var4.f(true);
                bp0 bp0Var = cp0Var4.f36064y;
                if (bp0Var != null) {
                    bp0Var.invalidate();
                }
                ip0 ip0Var2 = cp0Var4.f36059p0;
                cp0 cp0Var5 = ip0Var2.f38086n;
                if (cp0Var5 != null && (gp0Var = cp0Var5.f36040a) != null && (cp0Var2 = ip0Var2.h) != null) {
                    gp0Var.a(cp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f42019b.e.e();
                return;
        }
    }
}
