package org.telegram.ui;

import android.widget.LinearLayout;
public final class t20 extends LinearLayout {
    public boolean f50082a;
    public final org.telegram.ui.Components.hb0 f50083b;
    public final p20 f50084c;
    public final q20 d;

    public t20(LaunchActivity launchActivity, org.telegram.ui.Components.hb0 hb0Var, p20 p20Var, q20 q20Var) {
        super(launchActivity);
        this.f50083b = hb0Var;
        this.f50084c = p20Var;
        this.d = q20Var;
        this.f50082a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f50082a = true;
        org.telegram.ui.Components.hb0 hb0Var = this.f50083b;
        hb0Var.setItemCount(5);
        p20 p20Var = this.f50084c;
        p20Var.setItemCount(5);
        q20 q20Var = this.d;
        q20Var.setItemCount(5);
        hb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        p20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        q20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        this.f50082a = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f50082a) {
            return;
        }
        super.requestLayout();
    }
}
