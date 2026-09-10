package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class w21 implements Runnable {
    public final int f37683a;
    public final k31 f37684b;

    public w21(k31 k31Var, int i10) {
        this.f37683a = i10;
        this.f37684b = k31Var;
    }

    @Override
    public final void run() {
        switch (this.f37683a) {
            case 0:
                j31 j31Var = this.f37684b.f34212f;
                if (j31Var != null) {
                    j31Var.f33872s.setClickable(true);
                    return;
                }
                return;
            case 1:
                k31 k31Var = this.f37684b;
                k31Var.d0(0, k31Var.J, true);
                org.telegram.ui.Components.hj0 animatedDrawable = k31Var.F.getAnimatedDrawable();
                if (k31Var.I == null && animatedDrawable != null) {
                    k31Var.I = Bitmap.createBitmap(animatedDrawable.f23647b, animatedDrawable.f23649c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.E0 = 33;
                    animatedDrawable.a(k31Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                k31 k31Var2 = this.f37684b;
                AndroidUtilities.runOnUIThread(new ey0(17, k31Var2, SvgHelper.getBitmap(i10, k31Var2.f34216w.getWidth(), k31Var2.f34216w.getHeight(), -16777216)));
                return;
            case 3:
                k31 k31Var3 = this.f37684b;
                n7.a1 a1Var = k31Var3.f34209a;
                a1Var.f13938b = k31Var3.J.b(((org.telegram.ui.ActionBar.p2) ((k31) a1Var.f13939c)).currentAccount, k31Var3.K ? 1 : 0);
                return;
            case 4:
                k31.X(this.f37684b);
                return;
            default:
                k31.V(this.f37684b);
                return;
        }
    }
}
