package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class s21 implements Runnable {
    public final int f40291a;
    public final g31 f40292b;

    public s21(g31 g31Var, int i10) {
        this.f40291a = i10;
        this.f40292b = g31Var;
    }

    @Override
    public final void run() {
        switch (this.f40291a) {
            case 0:
                f31 f31Var = this.f40292b.f36542f;
                if (f31Var != null) {
                    f31Var.f36257s.setClickable(true);
                    return;
                }
                return;
            case 1:
                g31 g31Var = this.f40292b;
                g31Var.d0(0, g31Var.J, true);
                org.telegram.ui.Components.xi0 animatedDrawable = g31Var.F.getAnimatedDrawable();
                if (g31Var.I == null && animatedDrawable != null) {
                    g31Var.I = Bitmap.createBitmap(animatedDrawable.f32552b, animatedDrawable.f32554c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.E0 = 33;
                    animatedDrawable.a(g31Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                g31 g31Var2 = this.f40292b;
                AndroidUtilities.runOnUIThread(new rx0(20, g31Var2, SvgHelper.getBitmap(i10, g31Var2.f36546w.getWidth(), g31Var2.f36546w.getHeight(), -16777216)));
                return;
            case 3:
                g31 g31Var3 = this.f40292b;
                o0.a aVar = g31Var3.f36538a;
                aVar.f16769b = g31Var3.J.b(((org.telegram.ui.ActionBar.n2) ((g31) aVar.f16770c)).currentAccount, g31Var3.K ? 1 : 0);
                return;
            case 4:
                g31.X(this.f40292b);
                return;
            default:
                g31.V(this.f40292b);
                return;
        }
    }
}
