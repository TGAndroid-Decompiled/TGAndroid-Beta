package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r40 extends LinearLayout {
    public boolean f39911a;
    public final org.telegram.ui.Components.gd0 f39912b;
    public final n40 f39913c;
    public final o40 d;

    public r40(LaunchActivity launchActivity, org.telegram.ui.Components.gd0 gd0Var, n40 n40Var, o40 o40Var) {
        super(launchActivity);
        this.f39912b = gd0Var;
        this.f39913c = n40Var;
        this.d = o40Var;
        this.f39911a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f39911a = true;
        org.telegram.ui.Components.gd0 gd0Var = this.f39912b;
        gd0Var.setItemCount(5);
        n40 n40Var = this.f39913c;
        n40Var.setItemCount(5);
        o40 o40Var = this.d;
        o40Var.setItemCount(5);
        gd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        n40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        o40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f39911a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f39911a) {
            return;
        }
        super.requestLayout();
    }
}
