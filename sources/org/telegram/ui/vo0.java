package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class vo0 implements Utilities.Callback {
    public final int f42247a;
    public final wo0 f42248b;

    public vo0(wo0 wo0Var, int i10) {
        this.f42247a = i10;
        this.f42248b = wo0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        dp0 dp0Var;
        hp0 hp0Var;
        dp0 dp0Var2;
        switch (this.f42247a) {
            case 0:
                Integer num = (Integer) obj;
                wo0 wo0Var = this.f42248b;
                dp0 dp0Var3 = wo0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) dp0Var3.M.get(num);
                }
                dp0Var3.K = starGift;
                jp0 jp0Var = dp0Var3.f36261p0;
                if (starGift == null) {
                    yh.t3 t3Var = dp0Var3.J;
                    if (t3Var != null) {
                        t3Var.f();
                        dp0Var3.J = null;
                    }
                } else {
                    yh.t3 t3Var2 = dp0Var3.J;
                    if (t3Var2 == null || t3Var2.f50534b != starGift.f20496id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) jp0Var).currentAccount;
                        yh.t3 t3Var3 = new yh.t3(dp0Var3.K.f20496id, i10, new vo0(wo0Var, 2));
                        dp0Var3.J = t3Var3;
                        t3Var3.g(false);
                    }
                }
                dp0.a(dp0Var3);
                if (jp0Var.I.getCurrentPosition() == 1) {
                    dp0Var = jp0Var.f38254n;
                } else {
                    dp0Var = jp0Var.h;
                }
                dp0Var.e();
                return;
            case 1:
                dp0 dp0Var4 = this.f42248b.e;
                dp0Var4.h = ((Integer) obj).intValue();
                dp0Var4.f36262r = null;
                dp0Var4.f36263s = null;
                dp0Var4.I = null;
                dp0Var4.j(true);
                dp0Var4.i();
                dp0Var4.f(true);
                cp0 cp0Var = dp0Var4.f36266y;
                if (cp0Var != null) {
                    cp0Var.invalidate();
                }
                jp0 jp0Var2 = dp0Var4.f36261p0;
                dp0 dp0Var5 = jp0Var2.f38254n;
                if (dp0Var5 != null && (hp0Var = dp0Var5.f36242a) != null && (dp0Var2 = jp0Var2.h) != null) {
                    hp0Var.a(dp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f42248b.e.e();
                return;
        }
    }
}
