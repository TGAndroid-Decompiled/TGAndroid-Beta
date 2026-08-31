package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class wo0 implements Utilities.Callback {
    public final int f42866a;
    public final xo0 f42867b;

    public wo0(xo0 xo0Var, int i10) {
        this.f42866a = i10;
        this.f42867b = xo0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        dp0 dp0Var;
        hp0 hp0Var;
        dp0 dp0Var2;
        switch (this.f42866a) {
            case 0:
                Integer num = (Integer) obj;
                xo0 xo0Var = this.f42867b;
                dp0 dp0Var3 = xo0Var.f43444e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) dp0Var3.E.get(num);
                }
                dp0Var3.C = starGift;
                ip0 ip0Var = dp0Var3.f36282g0;
                if (starGift == null) {
                    lh.b5 b5Var = dp0Var3.B;
                    if (b5Var != null) {
                        b5Var.f();
                        dp0Var3.B = null;
                    }
                } else {
                    lh.b5 b5Var2 = dp0Var3.B;
                    if (b5Var2 == null || b5Var2.f12619b != starGift.f21070id) {
                        i10 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                        lh.b5 b5Var3 = new lh.b5(dp0Var3.C.f21070id, i10, new wo0(xo0Var, 2));
                        dp0Var3.B = b5Var3;
                        b5Var3.g(false);
                    }
                }
                dp0Var3.e();
                if (ip0Var.f37914y.getCurrentPosition() == 1) {
                    dp0Var = ip0Var.h;
                } else {
                    dp0Var = ip0Var.f37908f;
                }
                dp0Var.e();
                return;
            case 1:
                dp0 dp0Var4 = this.f42867b.f43444e;
                dp0Var4.f36283n = ((Integer) obj).intValue();
                dp0Var4.f36285s = null;
                dp0Var4.v = null;
                dp0Var4.f36288y = null;
                dp0Var4.i(true);
                dp0Var4.h();
                dp0Var4.f();
                cp0 cp0Var = dp0Var4.f36287x;
                if (cp0Var != null) {
                    cp0Var.invalidate();
                }
                ip0 ip0Var2 = dp0Var4.f36282g0;
                dp0 dp0Var5 = ip0Var2.h;
                if (dp0Var5 != null && (hp0Var = dp0Var5.f36271a) != null && (dp0Var2 = ip0Var2.f37908f) != null) {
                    hp0Var.a(dp0Var2.f36283n);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f42867b.f43444e.e();
                return;
        }
    }
}
