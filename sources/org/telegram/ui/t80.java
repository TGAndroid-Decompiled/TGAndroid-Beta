package org.telegram.ui;

import android.view.View;
public final class t80 implements View.OnLayoutChangeListener {
    public boolean f52260a;

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        if (i12 - i10 > i11 - i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f52260a) {
            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(this, 28));
            this.f52260a = z10;
        }
    }
}
