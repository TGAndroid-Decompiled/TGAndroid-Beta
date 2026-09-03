package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public abstract class th0 extends FrameLayout {
    public TLRPC.User f38520a;
    public org.telegram.ui.Components.f90 f38521b;
    public org.telegram.ui.Components.u00 f38522c;
    public boolean d;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.f90 f90Var = this.f38521b;
        org.telegram.ui.Components.u00 u00Var = this.f38522c;
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
        f90Var.setVisibility(8);
        if (z4) {
            u00Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z4) {
            u00Var.getLayoutParams().width = getMeasuredWidth();
            u00Var.setVisibility(0);
        }
        f90Var.setVisibility(0);
        f90Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
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
