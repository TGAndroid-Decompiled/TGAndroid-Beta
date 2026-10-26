package org.telegram.ui;

import android.view.View;
public final class r30 extends View {
    public final v50 f42990a;

    public r30(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f42990a = v50Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f42990a.S0();
        }
    }
}
