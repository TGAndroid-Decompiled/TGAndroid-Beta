package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class uo0 extends xo0 {
    public int G;
    public final rp0 H;

    public uo0(rp0 rp0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.H = rp0Var;
        this.G = 0;
    }

    @Override
    public final void a() {
        rp0 rp0Var = this.H;
        if (rp0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(rp0Var.getParentActivity(), rp0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = rp0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = rp0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        rp0Var.G0();
        rp0Var.B0();
    }
}
