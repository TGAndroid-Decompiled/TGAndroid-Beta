package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;
public final class y8 extends FragmentContextView {
    public final int P0;
    public final NotificationCenter.NotificationCenterDelegate Q0;

    public y8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, m2Var, frameLayout, false, d6Var);
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
                k9 k9Var = (k9) this.Q0;
                org.telegram.ui.Components.ls lsVar = k9Var.M;
                FrameLayout frameLayout = k9Var.N;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lsVar.i(frameLayout, z10, true);
                return;
            case 1:
                org.telegram.ui.Components.hj hjVar = (org.telegram.ui.Components.hj) this.Q0;
                org.telegram.ui.Components.ls lsVar2 = hjVar.f24790x;
                FrameLayout frameLayout2 = hjVar.f24791y;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lsVar2.i(frameLayout2, z11, true);
                return;
            default:
                wf1 wf1Var = (wf1) this.Q0;
                org.telegram.ui.Components.ls lsVar3 = wf1Var.U0;
                FrameLayout frameLayout3 = wf1Var.F0;
                if (i10 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                lsVar3.i(frameLayout3, z12, true);
                return;
        }
    }

    public y8(wf1 wf1Var, Context context, wf1 wf1Var2) {
        super(context, wf1Var2, null, false, null);
        this.P0 = 2;
        this.Q0 = wf1Var;
    }
}
