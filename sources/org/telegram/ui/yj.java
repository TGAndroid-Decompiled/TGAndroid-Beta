package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class yj extends FragmentContextView {
    public final int J0;
    public final tn K0;

    public yj(tn tnVar, Context context, tn tnVar2, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, tnVar2, null, true, c6Var);
        this.J0 = i10;
        switch (i10) {
            case 1:
                this.K0 = tnVar;
                super(context, tnVar2, null, false, c6Var);
                return;
            default:
                this.K0 = tnVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.J0) {
            case 0:
                tn tnVar = this.K0;
                org.telegram.ui.Components.vg vgVar = tnVar.I0;
                FrameLayout frameLayout = tnVar.W1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vgVar.i(frameLayout, z10, true);
                return;
            default:
                tn tnVar2 = this.K0;
                org.telegram.ui.Components.vg vgVar2 = tnVar2.I0;
                FrameLayout frameLayout2 = tnVar2.U1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                vgVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
