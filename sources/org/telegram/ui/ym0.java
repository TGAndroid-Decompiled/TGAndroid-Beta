package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
public final class ym0 extends an0 {
    public int G;
    public final tn0 H;

    public ym0(tn0 tn0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.H = tn0Var;
        this.G = 0;
    }

    @Override
    public final void a() {
        tn0 tn0Var = this.H;
        if (tn0Var.getParentActivity() != null) {
            org.telegram.messenger.i0.o3(tn0Var.getParentActivity(), tn0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = tn0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = tn0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        tn0Var.J0();
        tn0Var.E0();
    }
}
