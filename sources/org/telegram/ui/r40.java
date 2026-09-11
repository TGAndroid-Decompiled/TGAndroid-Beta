package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r40 extends LinearLayout {
    public boolean f40068a;
    public final org.telegram.ui.Components.vc0 f40069b;
    public final n40 f40070c;
    public final o40 d;

    public r40(LaunchActivity launchActivity, org.telegram.ui.Components.vc0 vc0Var, n40 n40Var, o40 o40Var) {
        super(launchActivity);
        this.f40069b = vc0Var;
        this.f40070c = n40Var;
        this.d = o40Var;
        this.f40068a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f40068a = true;
        org.telegram.ui.Components.vc0 vc0Var = this.f40069b;
        vc0Var.setItemCount(5);
        n40 n40Var = this.f40070c;
        n40Var.setItemCount(5);
        o40 o40Var = this.d;
        o40Var.setItemCount(5);
        vc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        n40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        o40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f40068a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f40068a) {
            return;
        }
        super.requestLayout();
    }
}
