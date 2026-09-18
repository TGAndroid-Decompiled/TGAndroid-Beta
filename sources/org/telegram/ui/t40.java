package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class t40 extends LinearLayout {
    public boolean f37652a;
    public final org.telegram.ui.Components.uc0 f37653b;
    public final p40 f37654c;
    public final q40 d;

    public t40(LaunchActivity launchActivity, org.telegram.ui.Components.uc0 uc0Var, p40 p40Var, q40 q40Var) {
        super(launchActivity);
        this.f37653b = uc0Var;
        this.f37654c = p40Var;
        this.d = q40Var;
        this.f37652a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f37652a = true;
        org.telegram.ui.Components.uc0 uc0Var = this.f37653b;
        uc0Var.setItemCount(5);
        p40 p40Var = this.f37654c;
        p40Var.setItemCount(5);
        q40 q40Var = this.d;
        q40Var.setItemCount(5);
        uc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        p40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        q40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f37652a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f37652a) {
            return;
        }
        super.requestLayout();
    }
}
