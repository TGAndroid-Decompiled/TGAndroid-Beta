package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zx0 extends q11 {
    public final by0 f54743f2;
    public final h11[] f54744g2;
    public final cy0 f54745h2;

    public zx0(cy0 cy0Var, cy0 cy0Var2, Activity activity, Integer num, by0 by0Var, h11[] h11VarArr) {
        super(cy0Var2, activity, false, num, 2, null);
        this.f54745h2 = cy0Var;
        this.f54743f2 = by0Var;
        this.f54744g2 = h11VarArr;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        if (l10 != null) {
            cy0 cy0Var = this.f54745h2;
            i7 = ((org.telegram.ui.ActionBar.g2) cy0Var).currentAccount;
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i7);
            d02.f2("animated_" + l10);
            by0 by0Var = this.f54743f2;
            if (by0Var != null) {
                by0Var.a(true);
            }
            h11 h11Var = this.f54744g2[0];
            if (h11Var != null) {
                cy0Var.f46912n = null;
                h11Var.dismiss();
            }
        }
    }

    @Override
    public final void r(a11 a11Var, ch.p0 p0Var) {
        int i7;
        cy0 cy0Var = this.f54745h2;
        i7 = ((org.telegram.ui.ActionBar.g2) cy0Var).currentAccount;
        org.telegram.messenger.ri.d0(i7).f2(p0Var.f5470f);
        by0 by0Var = this.f54743f2;
        if (by0Var != null) {
            by0Var.a(true);
        }
        h11 h11Var = this.f54744g2[0];
        if (h11Var != null) {
            cy0Var.f46912n = null;
            h11Var.dismiss();
        }
    }
}
