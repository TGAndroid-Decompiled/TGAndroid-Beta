package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class zj extends FragmentContextView {
    public final int R0;
    public final qn S0;

    public zj(qn qnVar, Context context, qn qnVar2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, qnVar2, null, true, d6Var);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = qnVar;
                super(context, qnVar2, null, false, d6Var);
                return;
            default:
                this.S0 = qnVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                qn qnVar = this.S0;
                org.telegram.ui.Components.ch chVar = qnVar.M0;
                FrameLayout frameLayout = qnVar.a2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                chVar.i(frameLayout, z10, true);
                return;
            default:
                qn qnVar2 = this.S0;
                org.telegram.ui.Components.ch chVar2 = qnVar2.M0;
                FrameLayout frameLayout2 = qnVar2.Y1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                chVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
