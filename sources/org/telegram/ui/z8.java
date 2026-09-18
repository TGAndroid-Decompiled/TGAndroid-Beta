package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;
public final class z8 extends FragmentContextView {
    public final int P0;
    public final NotificationCenter.NotificationCenterDelegate Q0;

    public z8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, n2Var, frameLayout, false, e6Var);
        this.P0 = i10;
        this.Q0 = notificationCenterDelegate;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.P0) {
            case 0:
                l9 l9Var = (l9) this.Q0;
                org.telegram.ui.Components.ks ksVar = l9Var.M;
                FrameLayout frameLayout = l9Var.N;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ksVar.i(frameLayout, z10, true);
                return;
            case 1:
                org.telegram.ui.Components.gj gjVar = (org.telegram.ui.Components.gj) this.Q0;
                org.telegram.ui.Components.ks ksVar2 = gjVar.f24420x;
                FrameLayout frameLayout2 = gjVar.f24421y;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ksVar2.i(frameLayout2, z11, true);
                return;
            default:
                dg1 dg1Var = (dg1) this.Q0;
                org.telegram.ui.Components.ks ksVar3 = dg1Var.U0;
                FrameLayout frameLayout3 = dg1Var.F0;
                if (i10 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ksVar3.i(frameLayout3, z12, true);
                return;
        }
    }

    public z8(dg1 dg1Var, Context context, dg1 dg1Var2) {
        super(context, dg1Var2, null, false, null);
        this.P0 = 2;
        this.Q0 = dg1Var;
    }
}
