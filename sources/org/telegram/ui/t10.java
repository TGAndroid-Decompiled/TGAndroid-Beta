package org.telegram.ui;

import android.view.View;
public final class t10 extends View {
    public t10(LaunchActivity launchActivity) {
        super(launchActivity);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
    }
}
