package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

public final class xj extends FragmentContextView {
    public final int J0;
    public final rn K0;

    public xj(rn rnVar, Context context, rn rnVar2, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, rnVar2, null, true, c6Var);
        this.J0 = i10;
        switch (i10) {
            case 1:
                this.K0 = rnVar;
                super(context, rnVar2, null, false, c6Var);
                break;
            default:
                this.K0 = rnVar;
                break;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        switch (this.J0) {
            case 0:
                rn rnVar = this.K0;
                rnVar.I0.i(rnVar.W1, i10 == 0, true);
                break;
            default:
                rn rnVar2 = this.K0;
                rnVar2.I0.i(rnVar2.U1, i10 == 0, true);
                break;
        }
    }
}
