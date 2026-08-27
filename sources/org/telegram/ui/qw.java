package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

public final class qw extends FragmentContextView {
    public final int J0;
    public final gy K0;

    public qw(gy gyVar, Context context, gy gyVar2, int i10) {
        super(context, gyVar2, true);
        this.J0 = i10;
        switch (i10) {
            case 1:
                this.K0 = gyVar;
                super(context, gyVar2, false);
                break;
            default:
                this.K0 = gyVar;
                break;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        switch (this.J0) {
            case 0:
                gy gyVar = this.K0;
                gyVar.F1.i(gyVar.C1, i10 == 0, true);
                break;
            default:
                gy gyVar2 = this.K0;
                gyVar2.F1.i(gyVar2.E1, i10 == 0, true);
                break;
        }
    }
}
