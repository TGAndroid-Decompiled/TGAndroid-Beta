package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public abstract class uh0 extends FrameLayout {
    public TLRPC.User f38479a;
    public org.telegram.ui.Components.o90 f38480b;
    public org.telegram.ui.Components.v00 f38481c;
    public boolean d;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.o90 o90Var = this.f38480b;
        org.telegram.ui.Components.v00 v00Var = this.f38481c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        boolean z10 = true;
        this.d = true;
        if (v00Var.getVisibility() != 0) {
            z10 = false;
        }
        o90Var.setVisibility(8);
        if (z10) {
            v00Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z10) {
            v00Var.getLayoutParams().width = getMeasuredWidth();
            v00Var.setVisibility(0);
        }
        o90Var.setVisibility(0);
        o90Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
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
