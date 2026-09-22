package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class r21 implements Runnable {
    public final int f37012a;
    public final f31 f37013b;

    public r21(f31 f31Var, int i10) {
        this.f37012a = i10;
        this.f37013b = f31Var;
    }

    @Override
    public final void run() {
        switch (this.f37012a) {
            case 0:
                e31 e31Var = this.f37013b.f33477f;
                if (e31Var != null) {
                    e31Var.f33162s.setClickable(true);
                    return;
                }
                return;
            case 1:
                f31 f31Var = this.f37013b;
                f31Var.d0(0, f31Var.J, true);
                org.telegram.ui.Components.xi0 animatedDrawable = f31Var.F.getAnimatedDrawable();
                if (f31Var.I == null && animatedDrawable != null) {
                    f31Var.I = Bitmap.createBitmap(animatedDrawable.f29944b, animatedDrawable.f29946c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(f31Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                f31 f31Var2 = this.f37013b;
                AndroidUtilities.runOnUIThread(new iy0(14, f31Var2, SvgHelper.getBitmap(i10, f31Var2.f33481w.getWidth(), f31Var2.f33481w.getHeight(), -16777216)));
                return;
            case 3:
                f31 f31Var3 = this.f37013b;
                o0.a aVar = f31Var3.f33474a;
                aVar.f15298b = f31Var3.J.b(((org.telegram.ui.ActionBar.n2) ((f31) aVar.f15299c)).currentAccount, f31Var3.K ? 1 : 0);
                return;
            case 4:
                f31.X(this.f37013b);
                return;
            default:
                f31.V(this.f37013b);
                return;
        }
    }
}
