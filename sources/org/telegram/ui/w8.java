package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class w8 extends FragmentContextView {
    public final int Y0 = 0;
    public final org.telegram.ui.ActionBar.d2 Z0;

    public w8(h9 h9Var, Context context, h9 h9Var2, ai.h5 h5Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, h9Var2, h5Var, false, e6Var);
        this.Z0 = h9Var;
    }

    @Override
    public final void setVisibility(int i3) {
        boolean z10;
        boolean z11;
        switch (this.Y0) {
            case 0:
                h9 h9Var = (h9) this.Z0;
                org.telegram.ui.Components.pr prVar = h9Var.J;
                FrameLayout frameLayout = h9Var.K;
                if (i3 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                prVar.i(frameLayout, z10, true);
                return;
            default:
                m91 m91Var = (m91) this.Z0;
                org.telegram.ui.Components.pr prVar2 = m91Var.V0;
                FrameLayout frameLayout2 = m91Var.G0;
                if (i3 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                prVar2.i(frameLayout2, z11, true);
                return;
        }
    }

    public w8(m91 m91Var, Context context, m91 m91Var2) {
        super(context, m91Var2, null, false, null);
        this.Z0 = m91Var;
    }
}
