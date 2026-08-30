package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class y11 implements Runnable {
    public final int f40356a;
    public final m21 f40357b;

    public y11(m21 m21Var, int i10) {
        this.f40356a = i10;
        this.f40357b = m21Var;
    }

    @Override
    public final void run() {
        switch (this.f40356a) {
            case 0:
                l21 l21Var = this.f40357b.f36172f;
                if (l21Var != null) {
                    l21Var.f35895s.setClickable(true);
                    return;
                }
                return;
            case 1:
                m21 m21Var = this.f40357b;
                m21Var.d0(0, m21Var.G, true);
                org.telegram.ui.Components.gj0 animatedDrawable = m21Var.C.getAnimatedDrawable();
                if (m21Var.F == null && animatedDrawable != null) {
                    m21Var.F = Bitmap.createBitmap(animatedDrawable.f25148b, animatedDrawable.f25150c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.B0 = 33;
                    animatedDrawable.a(m21Var.F);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                m21 m21Var2 = this.f40357b;
                AndroidUtilities.runOnUIThread(new l01(2, m21Var2, SvgHelper.getBitmap(i10, m21Var2.f36176w.getWidth(), m21Var2.f36176w.getHeight(), -16777216)));
                return;
            case 3:
                m21 m21Var3 = this.f40357b;
                n7.qa qaVar = m21Var3.f36169a;
                qaVar.f14702b = m21Var3.G.b(((org.telegram.ui.ActionBar.p2) ((m21) qaVar.f14703c)).currentAccount, m21Var3.H ? 1 : 0);
                return;
            case 4:
                m21.X(this.f40357b);
                return;
            default:
                m21.V(this.f40357b);
                return;
        }
    }
}
