package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class y8 extends FragmentContextView {
    public final int Y0 = 0;
    public final org.telegram.ui.ActionBar.g2 Z0;

    public y8(j9 j9Var, Context context, j9 j9Var2, w8 w8Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, j9Var2, w8Var, false, i6Var);
        this.Z0 = j9Var;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        boolean z11;
        switch (this.Y0) {
            case 0:
                j9 j9Var = (j9) this.Z0;
                org.telegram.ui.Components.bs bsVar = j9Var.I;
                FrameLayout frameLayout = j9Var.J;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bsVar.j(frameLayout, z10, true);
                return;
            default:
                w91 w91Var = (w91) this.Z0;
                org.telegram.ui.Components.bs bsVar2 = w91Var.V0;
                FrameLayout frameLayout2 = w91Var.G0;
                if (i7 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bsVar2.j(frameLayout2, z11, true);
                return;
        }
    }

    public y8(w91 w91Var, Context context, w91 w91Var2) {
        super(context, w91Var2, null, false, null);
        this.Z0 = w91Var;
    }
}
