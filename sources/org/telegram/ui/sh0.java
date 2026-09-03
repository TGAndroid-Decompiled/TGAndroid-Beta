package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public abstract class sh0 extends FrameLayout {
    public TLRPC.User f41241a;
    public org.telegram.ui.Components.g90 f41242b;
    public org.telegram.ui.Components.u00 f41243c;
    public boolean d;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.g90 g90Var = this.f41242b;
        org.telegram.ui.Components.u00 u00Var = this.f41243c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        boolean z4 = true;
        this.d = true;
        if (u00Var.getVisibility() != 0) {
            z4 = false;
        }
        g90Var.setVisibility(8);
        if (z4) {
            u00Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z4) {
            u00Var.getLayoutParams().width = getMeasuredWidth();
            u00Var.setVisibility(0);
        }
        g90Var.setVisibility(0);
        g90Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        this.d = false;
        super.onMeasure(i10, makeMeasureSpec);
    }

    @Override
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }
}
