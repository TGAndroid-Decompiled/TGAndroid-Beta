package org.telegram.ui;

import android.view.View;
public final class z20 extends View {
    public z20(LaunchActivity launchActivity) {
        super(launchActivity);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
    }
}
