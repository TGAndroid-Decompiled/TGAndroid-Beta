package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class w8 extends FragmentContextView {
    public final int R0 = 1;
    public final org.telegram.ui.ActionBar.m2 S0;

    public w8(i9 i9Var, Context context, i9 i9Var2, u8 u8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i9Var2, u8Var, false, d6Var);
        this.S0 = i9Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                i9 i9Var = (i9) this.S0;
                org.telegram.ui.Components.bt btVar = i9Var.M;
                FrameLayout frameLayout = i9Var.N;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                btVar.i(frameLayout, z10, true);
                return;
            default:
                eg1 eg1Var = (eg1) this.S0;
                org.telegram.ui.Components.bt btVar2 = eg1Var.U0;
                FrameLayout frameLayout2 = eg1Var.F0;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                btVar2.i(frameLayout2, z11, true);
                return;
        }
    }

    public w8(eg1 eg1Var, Context context, eg1 eg1Var2) {
        super(context, eg1Var2, null, false, null);
        this.S0 = eg1Var;
    }
}
