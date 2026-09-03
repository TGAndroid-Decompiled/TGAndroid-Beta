package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z51 extends FrameLayout {
    public FrameLayout f40405a;
    public org.telegram.ui.Cells.s3 f40406b;
    public eg.c1 f40407c;
    public String d;
    public ValueAnimator e;
    public float f40408f;
    public Boolean h;
    public ValueAnimator f40409n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
