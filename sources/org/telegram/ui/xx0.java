package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xx0 extends q11 {
    public final zx0 f51992e2;
    public final h11[] f51993f2;
    public final ay0 f51994g2;

    public xx0(ay0 ay0Var, ay0 ay0Var2, Activity activity, Integer num, zx0 zx0Var, h11[] h11VarArr) {
        super(ay0Var2, activity, false, num, 2, null);
        this.f51994g2 = ay0Var;
        this.f51992e2 = zx0Var;
        this.f51993f2 = h11VarArr;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        if (l10 != null) {
            ay0 ay0Var = this.f51994g2;
            i7 = ((org.telegram.ui.ActionBar.f2) ay0Var).currentAccount;
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i7);
            b02.a2("animated_" + l10);
            zx0 zx0Var = this.f51992e2;
            if (zx0Var != null) {
                zx0Var.a(true);
            }
            h11 h11Var = this.f51993f2[0];
            if (h11Var != null) {
                ay0Var.f44106n = null;
                h11Var.dismiss();
            }
        }
    }

    @Override
    public final void r(a11 a11Var, ch.o0 o0Var) {
        int i7;
        ay0 ay0Var = this.f51994g2;
        i7 = ((org.telegram.ui.ActionBar.f2) ay0Var).currentAccount;
        org.telegram.messenger.ui.b0(i7).a2(o0Var.f6356f);
        zx0 zx0Var = this.f51992e2;
        if (zx0Var != null) {
            zx0Var.a(true);
        }
        h11 h11Var = this.f51993f2[0];
        if (h11Var != null) {
            ay0Var.f44106n = null;
            h11Var.dismiss();
        }
    }
}
