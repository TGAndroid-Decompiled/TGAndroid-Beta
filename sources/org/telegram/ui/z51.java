package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z51 extends FrameLayout {
    public FrameLayout f43804a;
    public org.telegram.ui.Cells.t3 f43805b;
    public fg.b1 f43806c;
    public String d;
    public ValueAnimator f43807e;
    public float f43808f;
    public Boolean h;
    public ValueAnimator f43809n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
