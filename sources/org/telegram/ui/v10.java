package org.telegram.ui;

import android.view.View;
public final class v10 extends View {
    public v10(LaunchActivity launchActivity) {
        super(launchActivity);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
    }
}
