package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u51 extends FrameLayout {
    public FrameLayout f41791a;
    public org.telegram.ui.Cells.t3 f41792b;
    public fg.b1 f41793c;
    public String d;
    public ValueAnimator f41794e;
    public float f41795f;
    public Boolean h;
    public ValueAnimator f41796n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
