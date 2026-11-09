package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class w01 extends FrameLayout {
    public FrameLayout f50815a;
    public org.telegram.ui.Cells.w3 f50816b;
    public ug.p0 f50817c;
    public String d;
    public ValueAnimator f50818e;
    public float f50819f;
    public Boolean h;
    public ValueAnimator f50820n;

    @Override
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), 1073741824));
    }
}
