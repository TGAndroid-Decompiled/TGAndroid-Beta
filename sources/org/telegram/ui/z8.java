package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;
public final class z8 extends FragmentContextView {
    public final int K0;
    public final NotificationCenter.NotificationCenterDelegate L0;

    public z8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, p2Var, frameLayout, false, g6Var);
        this.K0 = i10;
        this.L0 = notificationCenterDelegate;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        switch (this.K0) {
            case 0:
                l9 l9Var = (l9) this.L0;
                org.telegram.ui.Components.ls lsVar = l9Var.J;
                FrameLayout frameLayout = l9Var.K;
                if (i10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                lsVar.i(frameLayout, z4, true);
                return;
            case 1:
                org.telegram.ui.Components.xi xiVar = (org.telegram.ui.Components.xi) this.L0;
                org.telegram.ui.Components.ls lsVar2 = xiVar.f33112x;
                FrameLayout frameLayout2 = xiVar.f33113y;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lsVar2.i(frameLayout2, z10, true);
                return;
            default:
                sf1 sf1Var = (sf1) this.L0;
                org.telegram.ui.Components.ls lsVar3 = sf1Var.R0;
                FrameLayout frameLayout3 = sf1Var.C0;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lsVar3.i(frameLayout3, z11, true);
                return;
        }
    }

    public z8(sf1 sf1Var, Context context, sf1 sf1Var2) {
        super(context, sf1Var2, null, false, null);
        this.K0 = 2;
        this.L0 = sf1Var;
    }
}
