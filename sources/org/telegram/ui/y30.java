package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y30 extends LinearLayout {
    public boolean f43345a;
    public final org.telegram.ui.Components.od0 f43346b;
    public final u30 f43347c;
    public final v30 d;

    public y30(LaunchActivity launchActivity, org.telegram.ui.Components.od0 od0Var, u30 u30Var, v30 v30Var) {
        super(launchActivity);
        this.f43346b = od0Var;
        this.f43347c = u30Var;
        this.d = v30Var;
        this.f43345a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f43345a = true;
        org.telegram.ui.Components.od0 od0Var = this.f43346b;
        od0Var.setItemCount(5);
        u30 u30Var = this.f43347c;
        u30Var.setItemCount(5);
        v30 v30Var = this.d;
        v30Var.setItemCount(5);
        od0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        u30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        v30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f43345a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f43345a) {
            return;
        }
        super.requestLayout();
    }
}
