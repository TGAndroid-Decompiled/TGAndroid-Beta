package org.telegram.ui;

import android.view.View;
public final class t30 extends View {
    public final x50 f43480a;

    public t30(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f43480a = x50Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f43480a.S0();
        }
    }
}
