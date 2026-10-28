package org.telegram.ui;

import android.view.View;
public final class uj0 implements View.OnLayoutChangeListener {
    public final float f44041a;
    public final int f44042b;

    public uj0(float f7, int i10) {
        this.f44041a = f7;
        this.f44042b = i10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        view.removeOnLayoutChangeListener(this);
        view.setTranslationX((this.f44041a + this.f44042b) - i10);
    }
}
