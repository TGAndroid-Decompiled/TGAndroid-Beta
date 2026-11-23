package org.telegram.ui;

import android.view.View;
public final class s80 implements View.OnLayoutChangeListener {
    public boolean f52002a;

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        if (i12 - i10 > i11 - i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f52002a) {
            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.ne(this, 28));
            this.f52002a = z10;
        }
    }
}
