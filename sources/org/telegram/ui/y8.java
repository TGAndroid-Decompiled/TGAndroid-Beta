package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;
public final class y8 extends FragmentContextView {
    public final int N0;
    public final NotificationCenter.NotificationCenterDelegate O0;

    public y8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, p2Var, frameLayout, false, f6Var);
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
                org.telegram.ui.Components.qs qsVar = k9Var.M;
                FrameLayout frameLayout = k9Var.N;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qsVar.i(frameLayout, z10, true);
                return;
            case 1:
                org.telegram.ui.Components.jj jjVar = (org.telegram.ui.Components.jj) this.O0;
                org.telegram.ui.Components.qs qsVar2 = jjVar.f24426x;
                FrameLayout frameLayout2 = jjVar.f24427y;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                qsVar2.i(frameLayout2, z11, true);
                return;
            default:
                ig1 ig1Var = (ig1) this.O0;
                org.telegram.ui.Components.qs qsVar3 = ig1Var.U0;
                FrameLayout frameLayout3 = ig1Var.F0;
                if (i10 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                qsVar3.i(frameLayout3, z12, true);
                return;
        }
    }

    public y8(ig1 ig1Var, Context context, ig1 ig1Var2) {
        super(context, ig1Var2, null, false, null);
        this.N0 = 2;
        this.O0 = ig1Var;
    }
}
