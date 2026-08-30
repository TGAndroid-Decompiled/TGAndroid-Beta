package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class s51 extends FrameLayout {
    public FrameLayout f38197a;
    public org.telegram.ui.Cells.t3 f38198b;
    public eg.c1 f38199c;
    public String d;
    public ValueAnimator e;
    public float f38200f;
    public Boolean h;
    public ValueAnimator f38201n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
