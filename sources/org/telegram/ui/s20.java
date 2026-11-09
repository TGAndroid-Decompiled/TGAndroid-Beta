package org.telegram.ui;

import android.widget.LinearLayout;
public final class s20 extends LinearLayout {
    public boolean f49730a;
    public final org.telegram.ui.Components.ib0 f49731b;
    public final o20 f49732c;
    public final p20 d;

    public s20(LaunchActivity launchActivity, org.telegram.ui.Components.ib0 ib0Var, o20 o20Var, p20 p20Var) {
        super(launchActivity);
        this.f49731b = ib0Var;
        this.f49732c = o20Var;
        this.d = p20Var;
        this.f49730a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f49730a = true;
        org.telegram.ui.Components.ib0 ib0Var = this.f49731b;
        ib0Var.setItemCount(5);
        o20 o20Var = this.f49732c;
        o20Var.setItemCount(5);
        p20 p20Var = this.d;
        p20Var.setItemCount(5);
        ib0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        o20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        p20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        this.f49730a = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f49730a) {
            return;
        }
        super.requestLayout();
    }
}
