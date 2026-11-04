package org.telegram.ui;

import android.view.View;
public final class z10 extends View {
    public final x30 f52502a;

    public z10(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f52502a = x30Var;
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f52502a.U0();
        }
    }
}
