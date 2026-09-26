package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class y8 extends FragmentContextView {
    public final int P0 = 0;
    public final org.telegram.ui.ActionBar.m2 Q0;

    public y8(k9 k9Var, Context context, k9 k9Var2, w8 w8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, k9Var2, w8Var, false, d6Var);
        this.Q0 = k9Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.P0) {
            case 0:
                k9 k9Var = (k9) this.Q0;
                org.telegram.ui.Components.ms msVar = k9Var.M;
                FrameLayout frameLayout = k9Var.N;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                msVar.i(frameLayout, z10, true);
                return;
            default:
                wf1 wf1Var = (wf1) this.Q0;
                org.telegram.ui.Components.ms msVar2 = wf1Var.U0;
                FrameLayout frameLayout2 = wf1Var.F0;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                msVar2.i(frameLayout2, z11, true);
                return;
        }
    }

    public y8(wf1 wf1Var, Context context, wf1 wf1Var2) {
        super(context, wf1Var2, null, false, null);
        this.Q0 = wf1Var;
    }
}
