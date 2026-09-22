package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r40 extends LinearLayout {
    public boolean f37020a;
    public final org.telegram.ui.Components.uc0 f37021b;
    public final n40 f37022c;
    public final o40 d;

    public r40(LaunchActivity launchActivity, org.telegram.ui.Components.uc0 uc0Var, n40 n40Var, o40 o40Var) {
        super(launchActivity);
        this.f37021b = uc0Var;
        this.f37022c = n40Var;
        this.d = o40Var;
        this.f37020a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f37020a = true;
        org.telegram.ui.Components.uc0 uc0Var = this.f37021b;
        uc0Var.setItemCount(5);
        n40 n40Var = this.f37022c;
        n40Var.setItemCount(5);
        o40 o40Var = this.d;
        o40Var.setItemCount(5);
        uc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        n40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        o40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f37020a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f37020a) {
            return;
        }
        super.requestLayout();
    }
}
