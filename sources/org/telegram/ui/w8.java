package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;
public final class w8 extends FragmentContextView {
    public final int J0;
    public final NotificationCenter.NotificationCenterDelegate K0;

    public w8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, o2Var, frameLayout, false, b6Var);
        this.J0 = i9;
        this.K0 = notificationCenterDelegate;
    }

    @Override
    public final void setVisibility(int i9) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.J0) {
            case 0:
                i9 i9Var = (i9) this.K0;
                org.telegram.ui.Components.bs bsVar = i9Var.I;
                FrameLayout frameLayout = i9Var.J;
                if (i9 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bsVar.i(frameLayout, z10, true);
                return;
            case 1:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.K0;
                org.telegram.ui.Components.bs bsVar2 = viVar.f33383x;
                FrameLayout frameLayout2 = viVar.f33384y;
                if (i9 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bsVar2.i(frameLayout2, z11, true);
                return;
            default:
                we1 we1Var = (we1) this.K0;
                org.telegram.ui.Components.bs bsVar3 = we1Var.Q0;
                FrameLayout frameLayout3 = we1Var.B0;
                if (i9 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                bsVar3.i(frameLayout3, z12, true);
                return;
        }
    }

    public w8(we1 we1Var, Context context, we1 we1Var2) {
        super(context, we1Var2, null, false, null);
        this.J0 = 2;
        this.K0 = we1Var;
    }
}
