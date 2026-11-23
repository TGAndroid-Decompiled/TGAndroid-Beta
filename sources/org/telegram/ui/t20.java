package org.telegram.ui;

import android.widget.LinearLayout;
public final class t20 extends LinearLayout {
    public boolean f52133a;
    public final org.telegram.ui.Components.tb0 f52134b;
    public final p20 f52135c;
    public final q20 d;

    public t20(LaunchActivity launchActivity, org.telegram.ui.Components.tb0 tb0Var, p20 p20Var, q20 q20Var) {
        super(launchActivity);
        this.f52134b = tb0Var;
        this.f52135c = p20Var;
        this.d = q20Var;
        this.f52133a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f52133a = true;
        org.telegram.ui.Components.tb0 tb0Var = this.f52134b;
        tb0Var.setItemCount(5);
        p20 p20Var = this.f52135c;
        p20Var.setItemCount(5);
        q20 q20Var = this.d;
        q20Var.setItemCount(5);
        tb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        p20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        q20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        this.f52133a = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f52133a) {
            return;
        }
        super.requestLayout();
    }
}
