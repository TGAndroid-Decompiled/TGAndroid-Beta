package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
public final class wm0 extends ym0 {
    public int G;
    public final rn0 H;

    public wm0(rn0 rn0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.H = rn0Var;
        this.G = 0;
    }

    @Override
    public final void a() {
        rn0 rn0Var = this.H;
        if (rn0Var.getParentActivity() != null) {
            org.telegram.messenger.i0.o3(rn0Var.getParentActivity(), rn0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = rn0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = rn0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        rn0Var.K0();
        rn0Var.F0();
    }
}
