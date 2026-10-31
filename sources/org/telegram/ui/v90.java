package org.telegram.ui;

import android.view.View;
public final class v90 implements View.OnLayoutChangeListener {
    public boolean f42684a;

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        if (i13 - i11 > i12 - i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f42684a) {
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(this, 8));
            this.f42684a = z10;
        }
    }
}
