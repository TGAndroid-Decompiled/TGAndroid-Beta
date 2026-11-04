package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.ui.Components.RadialProgressView;
public final class z91 extends RadialProgressView {
    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = org.telegram.messenger.g0.f22602m / 2;
    }
}
