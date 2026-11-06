package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class u01 extends FrameLayout {
    public FrameLayout f50170a;
    public org.telegram.ui.Cells.w3 f50171b;
    public ug.p0 f50172c;
    public String d;
    public ValueAnimator f50173e;
    public float f50174f;
    public Boolean h;
    public ValueAnimator f50175n;

    @Override
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), 1073741824));
    }
}
