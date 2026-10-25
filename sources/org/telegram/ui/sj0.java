package org.telegram.ui;

import android.view.View;
public final class sj0 implements View.OnLayoutChangeListener {
    public final float f43524a;
    public final int f43525b;

    public sj0(float f7, int i10) {
        this.f43524a = f7;
        this.f43525b = i10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        view.removeOnLayoutChangeListener(this);
        view.setTranslationX((this.f43524a + this.f43525b) - i10);
    }
}
