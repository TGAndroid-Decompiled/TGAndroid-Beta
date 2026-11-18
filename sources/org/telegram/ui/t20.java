package org.telegram.ui;

import android.widget.LinearLayout;
public final class t20 extends LinearLayout {
    public boolean f52131a;
    public final org.telegram.ui.Components.sb0 f52132b;
    public final p20 f52133c;
    public final q20 d;

    public t20(LaunchActivity launchActivity, org.telegram.ui.Components.sb0 sb0Var, p20 p20Var, q20 q20Var) {
        super(launchActivity);
        this.f52132b = sb0Var;
        this.f52133c = p20Var;
        this.d = q20Var;
        this.f52131a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f52131a = true;
        org.telegram.ui.Components.sb0 sb0Var = this.f52132b;
        sb0Var.setItemCount(5);
        p20 p20Var = this.f52133c;
        p20Var.setItemCount(5);
        q20 q20Var = this.d;
        q20Var.setItemCount(5);
        sb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        p20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        q20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        this.f52131a = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f52131a) {
            return;
        }
        super.requestLayout();
    }
}
