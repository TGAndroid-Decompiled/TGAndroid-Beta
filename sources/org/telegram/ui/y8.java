package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class y8 extends FragmentContextView {
    public final int X0 = 0;
    public final org.telegram.ui.ActionBar.k2 Y0;

    public y8(j9 j9Var, Context context, j9 j9Var2, w8 w8Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, j9Var2, w8Var, false, p6Var);
        this.Y0 = j9Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.X0) {
            case 0:
                j9 j9Var = (j9) this.Y0;
                org.telegram.ui.Components.zr zrVar = j9Var.I;
                FrameLayout frameLayout = j9Var.J;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zrVar.i(frameLayout, z10, true);
                return;
            default:
                pb1 pb1Var = (pb1) this.Y0;
                org.telegram.ui.Components.zr zrVar2 = pb1Var.U0;
                FrameLayout frameLayout2 = pb1Var.F0;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zrVar2.i(frameLayout2, z11, true);
                return;
        }
    }

    public y8(pb1 pb1Var, Context context, pb1 pb1Var2) {
        super(context, pb1Var2, null, false, null);
        this.Y0 = pb1Var;
    }
}
