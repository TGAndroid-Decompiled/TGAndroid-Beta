package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;
public final class y8 extends FragmentContextView {
    public final int N0;
    public final NotificationCenter.NotificationCenterDelegate O0;

    public y8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, n2Var, frameLayout, false, e6Var);
        this.N0 = i10;
        this.O0 = notificationCenterDelegate;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.N0) {
            case 0:
                k9 k9Var = (k9) this.O0;
                org.telegram.ui.Components.ks ksVar = k9Var.M;
                FrameLayout frameLayout = k9Var.N;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ksVar.i(frameLayout, z10, true);
                return;
            case 1:
                org.telegram.ui.Components.gj gjVar = (org.telegram.ui.Components.gj) this.O0;
                org.telegram.ui.Components.ks ksVar2 = gjVar.f24371x;
                FrameLayout frameLayout2 = gjVar.f24372y;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ksVar2.i(frameLayout2, z11, true);
                return;
            default:
                dg1 dg1Var = (dg1) this.O0;
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

    public y8(dg1 dg1Var, Context context, dg1 dg1Var2) {
        super(context, dg1Var2, null, false, null);
        this.N0 = 2;
        this.O0 = dg1Var;
    }
}
