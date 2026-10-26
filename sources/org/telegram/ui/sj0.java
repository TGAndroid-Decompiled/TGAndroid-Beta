package org.telegram.ui;

import android.view.View;
public final class sj0 implements View.OnLayoutChangeListener {
    public final float f43527a;
    public final int f43528b;

    public sj0(float f7, int i10) {
        this.f43527a = f7;
        this.f43528b = i10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        view.removeOnLayoutChangeListener(this);
        view.setTranslationX((this.f43527a + this.f43528b) - i10);
    }
}
