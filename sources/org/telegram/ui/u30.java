package org.telegram.ui;

import android.view.View;
public final class u30 extends org.telegram.ui.Cells.z3 {
    @Override
    public final void onMeasure(int i7, int i10) {
        if (org.telegram.messenger.g0.Q1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(420.0f), View.MeasureSpec.getSize(i7)), 1073741824), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }
}
