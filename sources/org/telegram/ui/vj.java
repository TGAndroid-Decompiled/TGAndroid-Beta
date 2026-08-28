package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class vj extends FragmentContextView {
    public final int J0;
    public final qn K0;

    public vj(qn qnVar, Context context, qn qnVar2, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, qnVar2, null, true, b6Var);
        this.J0 = i9;
        switch (i9) {
            case 1:
                this.K0 = qnVar;
                super(context, qnVar2, null, false, b6Var);
                return;
            default:
                this.K0 = qnVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i9) {
        boolean z10;
        boolean z11;
        switch (this.J0) {
            case 0:
                qn qnVar = this.K0;
                org.telegram.ui.Components.sg sgVar = qnVar.I0;
                FrameLayout frameLayout = qnVar.W1;
                if (i9 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sgVar.i(frameLayout, z10, true);
                return;
            default:
                qn qnVar2 = this.K0;
                org.telegram.ui.Components.sg sgVar2 = qnVar2.I0;
                FrameLayout frameLayout2 = qnVar2.U1;
                if (i9 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sgVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
