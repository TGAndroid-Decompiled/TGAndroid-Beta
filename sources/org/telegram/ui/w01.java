package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class w01 extends FrameLayout {
    public FrameLayout f52928a;
    public org.telegram.ui.Cells.x3 f52929b;
    public ug.r0 f52930c;
    public String d;
    public ValueAnimator f52931e;
    public float f52932f;
    public Boolean h;
    public ValueAnimator f52933n;

    @Override
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), 1073741824));
    }
}
