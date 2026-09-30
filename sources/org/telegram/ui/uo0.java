package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class uo0 extends yo0 {
    public int G;
    public final sp0 H;

    public uo0(sp0 sp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.H = sp0Var;
        this.G = 0;
    }

    @Override
    public final void a() {
        sp0 sp0Var = this.H;
        if (sp0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(sp0Var.getParentActivity(), sp0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = sp0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = sp0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        sp0Var.G0();
        sp0Var.A0();
    }
}
