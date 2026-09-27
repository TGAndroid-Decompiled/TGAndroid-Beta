package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class yw extends FragmentContextView {
    public final int Q0;
    public final ty R0;

    public yw(ty tyVar, Context context, ty tyVar2, int i10) {
        super(context, tyVar2, true);
        this.Q0 = i10;
        switch (i10) {
            case 1:
                this.R0 = tyVar;
                super(context, tyVar2, false);
                return;
            default:
                this.R0 = tyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.Q0) {
            case 0:
                ty tyVar = this.R0;
                org.telegram.ui.Components.ms msVar = tyVar.J1;
                FrameLayout frameLayout = tyVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                msVar.i(frameLayout, z10, true);
                return;
            default:
                ty tyVar2 = this.R0;
                org.telegram.ui.Components.ms msVar2 = tyVar2.J1;
                FrameLayout frameLayout2 = tyVar2.I1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                msVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
