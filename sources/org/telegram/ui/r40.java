package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r40 extends LinearLayout {
    public boolean f36958a;
    public final org.telegram.ui.Components.dd0 f36959b;
    public final n40 f36960c;
    public final o40 d;

    public r40(LaunchActivity launchActivity, org.telegram.ui.Components.dd0 dd0Var, n40 n40Var, o40 o40Var) {
        super(launchActivity);
        this.f36959b = dd0Var;
        this.f36960c = n40Var;
        this.d = o40Var;
        this.f36958a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f36958a = true;
        org.telegram.ui.Components.dd0 dd0Var = this.f36959b;
        dd0Var.setItemCount(5);
        n40 n40Var = this.f36960c;
        n40Var.setItemCount(5);
        o40 o40Var = this.d;
        o40Var.setItemCount(5);
        dd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        n40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        o40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f36958a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f36958a) {
            return;
        }
        super.requestLayout();
    }
}
