package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;
public final class v8 extends FragmentContextView {
    public final int J0;
    public final NotificationCenter.NotificationCenterDelegate K0;

    public v8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, o2Var, frameLayout, false, c6Var);
        this.J0 = i10;
        this.K0 = notificationCenterDelegate;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.J0) {
            case 0:
                h9 h9Var = (h9) this.K0;
                org.telegram.ui.Components.fs fsVar = h9Var.I;
                FrameLayout frameLayout = h9Var.J;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fsVar.i(frameLayout, z10, true);
                return;
            case 1:
                org.telegram.ui.Components.yi yiVar = (org.telegram.ui.Components.yi) this.K0;
                org.telegram.ui.Components.fs fsVar2 = yiVar.f35079x;
                FrameLayout frameLayout2 = yiVar.f35080y;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                fsVar2.i(frameLayout2, z11, true);
                return;
            default:
                ze1 ze1Var = (ze1) this.K0;
                org.telegram.ui.Components.fs fsVar3 = ze1Var.Q0;
                FrameLayout frameLayout3 = ze1Var.B0;
                if (i10 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                fsVar3.i(frameLayout3, z12, true);
                return;
        }
    }

    public v8(ze1 ze1Var, Context context, ze1 ze1Var2) {
        super(context, ze1Var2, null, false, null);
        this.J0 = 2;
        this.K0 = ze1Var;
    }
}
