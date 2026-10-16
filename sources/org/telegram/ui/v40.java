package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v40 extends LinearLayout {
    public boolean f40581a;
    public final org.telegram.ui.Components.ud0 f40582b;
    public final r40 f40583c;
    public final s40 d;

    public v40(LaunchActivity launchActivity, org.telegram.ui.Components.ud0 ud0Var, r40 r40Var, s40 s40Var) {
        super(launchActivity);
        this.f40582b = ud0Var;
        this.f40583c = r40Var;
        this.d = s40Var;
        this.f40581a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f40581a = true;
        org.telegram.ui.Components.ud0 ud0Var = this.f40582b;
        ud0Var.setItemCount(5);
        r40 r40Var = this.f40583c;
        r40Var.setItemCount(5);
        s40 s40Var = this.d;
        s40Var.setItemCount(5);
        ud0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        r40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        s40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f40581a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f40581a) {
            return;
        }
        super.requestLayout();
    }
}
