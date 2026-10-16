package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class x21 implements Runnable {
    public final int f41410a;
    public final l31 f41411b;

    public x21(l31 l31Var, int i10) {
        this.f41410a = i10;
        this.f41411b = l31Var;
    }

    @Override
    public final void run() {
        switch (this.f41410a) {
            case 0:
                k31 k31Var = this.f41411b.f37595f;
                if (k31Var != null) {
                    k31Var.f37230s.setClickable(true);
                    return;
                }
                return;
            case 1:
                l31 l31Var = this.f41411b;
                l31Var.c0(0, l31Var.J, true);
                org.telegram.ui.Components.yj0 animatedDrawable = l31Var.F.getAnimatedDrawable();
                if (l31Var.I == null && animatedDrawable != null) {
                    l31Var.I = Bitmap.createBitmap(animatedDrawable.f31286b, animatedDrawable.f31288c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(l31Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                l31 l31Var2 = this.f41411b;
                AndroidUtilities.runOnUIThread(new i11(4, l31Var2, SvgHelper.getBitmap(i10, l31Var2.f37599w.getWidth(), l31Var2.f37599w.getHeight(), -16777216)));
                return;
            case 3:
                l31 l31Var3 = this.f41411b;
                m2.t tVar = l31Var3.f37592a;
                tVar.f15110b = l31Var3.J.b(((org.telegram.ui.ActionBar.m2) ((l31) tVar.f15111c)).currentAccount, l31Var3.K ? 1 : 0);
                return;
            case 4:
                l31.W(this.f41411b);
                return;
            default:
                l31.U(this.f41411b);
                return;
        }
    }
}
