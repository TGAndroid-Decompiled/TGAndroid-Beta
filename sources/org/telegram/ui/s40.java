package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class s40 extends LinearLayout {
    public boolean f36544a;
    public final org.telegram.ui.Components.dd0 f36545b;
    public final o40 f36546c;
    public final p40 d;

    public s40(LaunchActivity launchActivity, org.telegram.ui.Components.dd0 dd0Var, o40 o40Var, p40 p40Var) {
        super(launchActivity);
        this.f36545b = dd0Var;
        this.f36546c = o40Var;
        this.d = p40Var;
        this.f36544a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f36544a = true;
        org.telegram.ui.Components.dd0 dd0Var = this.f36545b;
        dd0Var.setItemCount(5);
        o40 o40Var = this.f36546c;
        o40Var.setItemCount(5);
        p40 p40Var = this.d;
        p40Var.setItemCount(5);
        dd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        o40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        p40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f36544a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f36544a) {
            return;
        }
        super.requestLayout();
    }
}
