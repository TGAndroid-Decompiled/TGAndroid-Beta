package org.telegram.ui;

import android.widget.LinearLayout;
public final class s20 extends LinearLayout {
    public boolean f51945a;
    public final org.telegram.ui.Components.qb0 f51946b;
    public final o20 f51947c;
    public final p20 d;

    public s20(LaunchActivity launchActivity, org.telegram.ui.Components.qb0 qb0Var, o20 o20Var, p20 p20Var) {
        super(launchActivity);
        this.f51946b = qb0Var;
        this.f51947c = o20Var;
        this.d = p20Var;
        this.f51945a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f51945a = true;
        org.telegram.ui.Components.qb0 qb0Var = this.f51946b;
        qb0Var.setItemCount(5);
        o20 o20Var = this.f51947c;
        o20Var.setItemCount(5);
        p20 p20Var = this.d;
        p20Var.setItemCount(5);
        qb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        o20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        p20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        this.f51945a = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f51945a) {
            return;
        }
        super.requestLayout();
    }
}
