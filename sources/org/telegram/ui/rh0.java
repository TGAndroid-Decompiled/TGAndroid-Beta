package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public abstract class rh0 extends FrameLayout {
    public TLRPC.User f38052a;
    public org.telegram.ui.Components.e90 f38053b;
    public org.telegram.ui.Components.t00 f38054c;
    public boolean d;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.e90 e90Var = this.f38053b;
        org.telegram.ui.Components.t00 t00Var = this.f38054c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        boolean z4 = true;
        this.d = true;
        if (t00Var.getVisibility() != 0) {
            z4 = false;
        }
        e90Var.setVisibility(8);
        if (z4) {
            t00Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z4) {
            t00Var.getLayoutParams().width = getMeasuredWidth();
            t00Var.setVisibility(0);
        }
        e90Var.setVisibility(0);
        e90Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
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
