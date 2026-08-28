package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x30 extends LinearLayout {
    public boolean f44352a;
    public final org.telegram.ui.Components.bc0 f44353b;
    public final t30 f44354c;
    public final u30 d;

    public x30(LaunchActivity launchActivity, org.telegram.ui.Components.bc0 bc0Var, t30 t30Var, u30 u30Var) {
        super(launchActivity);
        this.f44353b = bc0Var;
        this.f44354c = t30Var;
        this.d = u30Var;
        this.f44352a = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        this.f44352a = true;
        org.telegram.ui.Components.bc0 bc0Var = this.f44353b;
        bc0Var.setItemCount(5);
        t30 t30Var = this.f44354c;
        t30Var.setItemCount(5);
        u30 u30Var = this.d;
        u30Var.setItemCount(5);
        bc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        t30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        u30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f44352a = false;
        super.onMeasure(i9, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f44352a) {
            return;
        }
        super.requestLayout();
    }
}
