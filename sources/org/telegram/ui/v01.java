package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class v01 extends FrameLayout {
    public FrameLayout f52654a;
    public org.telegram.ui.Cells.w3 f52655b;
    public ug.s0 f52656c;
    public String d;
    public ValueAnimator f52657e;
    public float f52658f;
    public Boolean h;
    public ValueAnimator f52659n;

    @Override
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), 1073741824));
    }
}
