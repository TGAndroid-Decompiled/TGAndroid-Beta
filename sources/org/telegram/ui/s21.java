package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class s21 implements Runnable {
    public final int f37374a;
    public final g31 f37375b;

    public s21(g31 g31Var, int i10) {
        this.f37374a = i10;
        this.f37375b = g31Var;
    }

    @Override
    public final void run() {
        switch (this.f37374a) {
            case 0:
                f31 f31Var = this.f37375b.f33835f;
                if (f31Var != null) {
                    f31Var.f33537s.setClickable(true);
                    return;
                }
                return;
            case 1:
                g31 g31Var = this.f37375b;
                g31Var.d0(0, g31Var.J, true);
                org.telegram.ui.Components.yi0 animatedDrawable = g31Var.F.getAnimatedDrawable();
                if (g31Var.I == null && animatedDrawable != null) {
                    g31Var.I = Bitmap.createBitmap(animatedDrawable.f30223b, animatedDrawable.f30225c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(g31Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                g31 g31Var2 = this.f37375b;
                AndroidUtilities.runOnUIThread(new ky0(14, g31Var2, SvgHelper.getBitmap(i10, g31Var2.f33839w.getWidth(), g31Var2.f33839w.getHeight(), -16777216)));
                return;
            case 3:
                g31 g31Var3 = this.f37375b;
                o0.a aVar = g31Var3.f33832a;
                aVar.f15310b = g31Var3.J.b(((org.telegram.ui.ActionBar.o2) ((g31) aVar.f15311c)).currentAccount, g31Var3.K ? 1 : 0);
                return;
            case 4:
                g31.X(this.f37375b);
                return;
            default:
                g31.V(this.f37375b);
                return;
        }
    }
}
