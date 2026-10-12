package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class s21 implements Runnable {
    public final int f41791a;
    public final g31 f41792b;

    public s21(g31 g31Var, int i10) {
        this.f41791a = i10;
        this.f41792b = g31Var;
    }

    @Override
    public final void run() {
        switch (this.f41791a) {
            case 0:
                f31 f31Var = this.f41792b.f37908f;
                if (f31Var != null) {
                    f31Var.f37621s.setClickable(true);
                    return;
                }
                return;
            case 1:
                g31 g31Var = this.f41792b;
                g31Var.c0(0, g31Var.J, true);
                org.telegram.ui.Components.fk0 animatedDrawable = g31Var.F.getAnimatedDrawable();
                if (g31Var.I == null && animatedDrawable != null) {
                    g31Var.I = Bitmap.createBitmap(animatedDrawable.f26104b, animatedDrawable.f26106c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(g31Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                g31 g31Var2 = this.f41792b;
                AndroidUtilities.runOnUIThread(new du0(26, g31Var2, SvgHelper.getBitmap(i10, g31Var2.f37912w.getWidth(), g31Var2.f37912w.getHeight(), -16777216)));
                return;
            case 3:
                g31 g31Var3 = this.f41792b;
                n7.z0 z0Var = g31Var3.f37904a;
                z0Var.f16573b = g31Var3.J.b(((org.telegram.ui.ActionBar.m2) ((g31) z0Var.f16574c)).currentAccount, g31Var3.K ? 1 : 0);
                return;
            case 4:
                g31.W(this.f41792b);
                return;
            default:
                g31.U(this.f41792b);
                return;
        }
    }
}
