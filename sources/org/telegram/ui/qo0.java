package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class qo0 extends to0 {
    public int D;
    public final np0 E;

    public qo0(np0 np0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.E = np0Var;
        this.D = 0;
    }

    @Override
    public final void a() {
        np0 np0Var = this.E;
        if (np0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(np0Var.getParentActivity(), np0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.D != actionBarButtonColor) {
            ImageView imageView = np0Var.G;
            if (imageView != null) {
                this.D = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = np0Var.H;
            if (imageView2 != null) {
                this.D = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        np0Var.G0();
        np0Var.A0();
    }
}
