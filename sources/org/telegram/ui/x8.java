package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class x8 extends FragmentContextView {
    public final int R0 = 1;
    public final org.telegram.ui.ActionBar.n2 S0;

    public x8(j9 j9Var, Context context, j9 j9Var2, v8 v8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j9Var2, v8Var, false, e6Var);
        this.S0 = j9Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                j9 j9Var = (j9) this.S0;
                org.telegram.ui.Components.at atVar = j9Var.M;
                FrameLayout frameLayout = j9Var.N;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                atVar.i(frameLayout, z10, true);
                return;
            default:
                fg1 fg1Var = (fg1) this.S0;
                org.telegram.ui.Components.at atVar2 = fg1Var.U0;
                FrameLayout frameLayout2 = fg1Var.F0;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                atVar2.i(frameLayout2, z11, true);
                return;
        }
    }

    public x8(fg1 fg1Var, Context context, fg1 fg1Var2) {
        super(context, fg1Var2, null, false, null);
        this.S0 = fg1Var;
    }
}
