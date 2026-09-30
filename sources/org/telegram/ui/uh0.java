package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public abstract class uh0 extends FrameLayout {
    public TLRPC.User f38570a;
    public org.telegram.ui.Components.q90 f38571b;
    public org.telegram.ui.Components.w00 f38572c;
    public boolean d;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.q90 q90Var = this.f38571b;
        org.telegram.ui.Components.w00 w00Var = this.f38572c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        boolean z10 = true;
        this.d = true;
        if (w00Var.getVisibility() != 0) {
            z10 = false;
        }
        q90Var.setVisibility(8);
        if (z10) {
            w00Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z10) {
            w00Var.getLayoutParams().width = getMeasuredWidth();
            w00Var.setVisibility(0);
        }
        q90Var.setVisibility(0);
        q90Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
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
