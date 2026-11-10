package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class x01 extends FrameLayout {
    public FrameLayout f51487a;
    public org.telegram.ui.Cells.w3 f51488b;
    public ug.p0 f51489c;
    public String d;
    public ValueAnimator f51490e;
    public float f51491f;
    public Boolean h;
    public ValueAnimator f51492n;

    @Override
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), 1073741824));
    }
}
