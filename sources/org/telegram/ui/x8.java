package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class x8 extends FragmentContextView {
    public final int Y0 = 0;
    public final org.telegram.ui.ActionBar.e2 Z0;

    public x8(i9 i9Var, Context context, i9 i9Var2, v8 v8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i9Var2, v8Var, false, e6Var);
        this.Z0 = i9Var;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        boolean z11;
        switch (this.Y0) {
            case 0:
                i9 i9Var = (i9) this.Z0;
                org.telegram.ui.Components.vr vrVar = i9Var.J;
                FrameLayout frameLayout = i9Var.K;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vrVar.i(frameLayout, z10, true);
                return;
            default:
                u91 u91Var = (u91) this.Z0;
                org.telegram.ui.Components.vr vrVar2 = u91Var.V0;
                FrameLayout frameLayout2 = u91Var.G0;
                if (i7 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                vrVar2.i(frameLayout2, z11, true);
                return;
        }
    }

    public x8(u91 u91Var, Context context, u91 u91Var2) {
        super(context, u91Var2, null, false, null);
        this.Z0 = u91Var;
    }
}
