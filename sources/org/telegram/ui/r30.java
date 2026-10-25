package org.telegram.ui;

import android.view.View;
public final class r30 extends View {
    public final v50 f42987a;

    public r30(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f42987a = v50Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f42987a.S0();
        }
    }
}
