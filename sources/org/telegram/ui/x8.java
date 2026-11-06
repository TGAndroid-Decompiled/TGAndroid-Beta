package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class x8 extends FragmentContextView {
    public final int X0 = 0;
    public final org.telegram.ui.ActionBar.f2 Y0;

    public x8(i9 i9Var, Context context, i9 i9Var2, v8 v8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i9Var2, v8Var, false, f6Var);
        this.Y0 = i9Var;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        boolean z10;
        switch (this.X0) {
            case 0:
                i9 i9Var = (i9) this.Y0;
                org.telegram.ui.Components.pr prVar = i9Var.I;
                FrameLayout frameLayout = i9Var.J;
                if (i7 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                prVar.i(frameLayout, z9, true);
                return;
            default:
                v91 v91Var = (v91) this.Y0;
                org.telegram.ui.Components.pr prVar2 = v91Var.U0;
                FrameLayout frameLayout2 = v91Var.F0;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                prVar2.i(frameLayout2, z10, true);
                return;
        }
    }

    public x8(v91 v91Var, Context context, v91 v91Var2) {
        super(context, v91Var2, null, false, null);
        this.Y0 = v91Var;
    }
}
