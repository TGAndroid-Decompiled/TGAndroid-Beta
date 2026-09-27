package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class yo0 extends cp0 {
    public int G;
    public final wp0 H;

    public yo0(wp0 wp0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.H = wp0Var;
        this.G = 0;
    }

    @Override
    public final void a() {
        wp0 wp0Var = this.H;
        if (wp0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(wp0Var.getParentActivity(), wp0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = wp0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = wp0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        wp0Var.G0();
        wp0Var.A0();
    }
}
