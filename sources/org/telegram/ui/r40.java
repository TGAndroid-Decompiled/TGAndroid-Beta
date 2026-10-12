package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r40 extends LinearLayout {
    public boolean f41504a;
    public final org.telegram.ui.Components.yd0 f41505b;
    public final n40 f41506c;
    public final o40 d;

    public r40(LaunchActivity launchActivity, org.telegram.ui.Components.yd0 yd0Var, n40 n40Var, o40 o40Var) {
        super(launchActivity);
        this.f41505b = yd0Var;
        this.f41506c = n40Var;
        this.d = o40Var;
        this.f41504a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f41504a = true;
        org.telegram.ui.Components.yd0 yd0Var = this.f41505b;
        yd0Var.setItemCount(5);
        n40 n40Var = this.f41506c;
        n40Var.setItemCount(5);
        o40 o40Var = this.d;
        o40Var.setItemCount(5);
        yd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        n40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        o40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f41504a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f41504a) {
            return;
        }
        super.requestLayout();
    }
}
