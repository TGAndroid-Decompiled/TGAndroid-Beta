package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class wo0 implements Utilities.Callback {
    public final int f42925a;
    public final xo0 f42926b;

    public wo0(xo0 xo0Var, int i10) {
        this.f42925a = i10;
        this.f42926b = xo0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        ep0 ep0Var;
        ip0 ip0Var;
        ep0 ep0Var2;
        switch (this.f42925a) {
            case 0:
                Integer num = (Integer) obj;
                xo0 xo0Var = this.f42926b;
                ep0 ep0Var3 = xo0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) ep0Var3.M.get(num);
                }
                ep0Var3.K = starGift;
                kp0 kp0Var = ep0Var3.f36599p0;
                if (starGift == null) {
                    yh.t3 t3Var = ep0Var3.J;
                    if (t3Var != null) {
                        t3Var.f();
                        ep0Var3.J = null;
                    }
                } else {
                    yh.t3 t3Var2 = ep0Var3.J;
                    if (t3Var2 == null || t3Var2.f50559b != starGift.f20503id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) kp0Var).currentAccount;
                        yh.t3 t3Var3 = new yh.t3(ep0Var3.K.f20503id, i10, new wo0(xo0Var, 2));
                        ep0Var3.J = t3Var3;
                        t3Var3.g(false);
                    }
                }
                ep0.a(ep0Var3);
                if (kp0Var.I.getCurrentPosition() == 1) {
                    ep0Var = kp0Var.f38653n;
                } else {
                    ep0Var = kp0Var.h;
                }
                ep0Var.e();
                return;
            case 1:
                ep0 ep0Var4 = this.f42926b.e;
                ep0Var4.h = ((Integer) obj).intValue();
                ep0Var4.f36600r = null;
                ep0Var4.f36601s = null;
                ep0Var4.I = null;
                ep0Var4.j(true);
                ep0Var4.i();
                ep0Var4.f(true);
                dp0 dp0Var = ep0Var4.f36604y;
                if (dp0Var != null) {
                    dp0Var.invalidate();
                }
                kp0 kp0Var2 = ep0Var4.f36599p0;
                ep0 ep0Var5 = kp0Var2.f38653n;
                if (ep0Var5 != null && (ip0Var = ep0Var5.f36580a) != null && (ep0Var2 = kp0Var2.h) != null) {
                    ip0Var.a(ep0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f42926b.e.e();
                return;
        }
    }
}
