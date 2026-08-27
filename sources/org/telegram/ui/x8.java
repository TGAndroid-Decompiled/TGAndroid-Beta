package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;

public final class x8 extends FragmentContextView {
    public final int J0;
    public final NotificationCenter.NotificationCenterDelegate K0;

    public x8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, n2Var, frameLayout, false, c6Var);
        this.J0 = i10;
        this.K0 = notificationCenterDelegate;
    }

    @Override
    public final void setVisibility(int i10) {
        switch (this.J0) {
            case 0:
                j9 j9Var = (j9) this.K0;
                j9Var.I.i(j9Var.J, i10 == 0, true);
                break;
            case 1:
                org.telegram.ui.Components.ri riVar = (org.telegram.ui.Components.ri) this.K0;
                riVar.f32185x.i(riVar.f32186y, i10 == 0, true);
                break;
            default:
                we1 we1Var = (we1) this.K0;
                we1Var.Q0.i(we1Var.B0, i10 == 0, true);
                break;
        }
    }

    public x8(we1 we1Var, Context context, we1 we1Var2) {
        super(context, we1Var2, null, false, null);
        this.J0 = 2;
        this.K0 = we1Var;
    }
}
